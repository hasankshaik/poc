package uk.co.dev.parentalcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uk.co.dev.constants.Messages;
import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.domain.Movie;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;
import uk.co.dev.response.ResponceObj;

@RestController
public class ParentalControlService implements IParentalControlService {

	@Autowired
	private IMovieService movieService;

	@RequestMapping(path = "/api/canwatch/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponceObj canWatch(@PathVariable(value = "movieId") String movieId) {
		return isSuitableToWatch(ParentalControlLevel.FOR12, movieId);
	}

	@RequestMapping(path = "/api/movie", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movieId) {
		movieService.saveMovie(movieId);
		return new ResponseEntity<Movie>(HttpStatus.CREATED);
	}

	@Override
	public ResponceObj isSuitableToWatch(
			ParentalControlLevel customerPreferenceLevel, String movieId) {
		ResponceObj responceObj = new ResponceObj();
		try {
			responceObj.setCanWatch(true);
			responceObj.setMessage(Messages.ENJOY_THE_MOVIE);
			ParentalControlLevel movieRatingLevel = ParentalControlLevel
					.getParentalControlLevel(movieService
							.getParentalControlLevel(movieId));
			Boolean canWatch = customerPreferenceLevel
					.isSuitableToWatch(movieRatingLevel);
			if (!canWatch) {
				responceObj.setCanWatch(false);
				responceObj.setMessage(Messages.NOT_SUITABLE);
			}
			return responceObj;
		} catch (TitleNotFoundException e) {
			responceObj.setCanWatch(false);
			responceObj.setMessage(Messages.TITLE_NOT_FOUND);
		} catch (TechnicalFailureException e) {
			responceObj.setCanWatch(false);
			responceObj.setMessage(Messages.TECHNICAL_FAILURE);
		}
		return responceObj;
	}

}
