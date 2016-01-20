package uk.co.dev.parentalcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.dev.constants.Messages;
import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;
import uk.co.dev.response.ResponceObj;

@Service
public class ParentalControlService implements IParentalControlService {



	@Autowired
	private MovieService movieService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * uk.co.dev.parentalcontrol.IParentalControlService#isSuitableToWatch(uk
	 * .co.dev.constants.ParentalControlLevel, java.lang.String)
	 */
	@Override
	public ResponceObj isSuitableToWatch(ParentalControlLevel customerPreferenceLevel, String movieId) {
		ResponceObj responceObj = new ResponceObj();
		try {
			responceObj.setCanWatch(true);
			responceObj.setMessage(Messages.ENJOY_THE_MOVIE);
			ParentalControlLevel movieRatingLevel = ParentalControlLevel.getParentalControlLevel(movieService
					.getParentalControlLevel(movieId));
			Boolean canWatch = customerPreferenceLevel.isSuitableToWatch(movieRatingLevel);
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
	
	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}
}
