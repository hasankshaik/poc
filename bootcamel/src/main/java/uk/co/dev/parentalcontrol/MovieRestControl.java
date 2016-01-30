package uk.co.dev.parentalcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uk.co.dev.domain.Movie;
import uk.co.dev.parentalcontrol.api.IMovieService;

@RestController
public class MovieRestControl {

	@Autowired
	private IMovieService movieService;

	@RequestMapping(path = "/api/movie/{movieId}", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<Movie> getMovie(@RequestParam String movieId) {
		Movie movie = movieService.getMovie(Long.parseLong(movieId));
		return new ResponseEntity<Movie>(movie, HttpStatus.OK);
	}

	@RequestMapping(path = "/api/movie", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movieId) {
		movieService.saveMovie(movieId);
		return new ResponseEntity<Movie>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/api/movie", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	public ResponseEntity<Movie> updateMovie(@RequestBody Movie movieId) {
		movieService.updateMovie(movieId);
		return new ResponseEntity<Movie>(HttpStatus.ACCEPTED);
	}

	@RequestMapping(path = "/api/movie/{movieId}", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
	public ResponseEntity<Movie> deleteMovie(@RequestParam String movieId) {
		movieService.deleteMovie(Long.parseLong(movieId));
		return new ResponseEntity<Movie>(HttpStatus.OK);
	}

}
