package uk.co.dev.parentalcontrol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uk.co.dev.domain.Movie;
import uk.co.dev.parentalcontrol.api.IMovieService;
import uk.co.dev.response.MovieVO;
import uk.co.dev.utils.Convertor;

@RestController
public class MovieRestControl {

	@Autowired
	private IMovieService movieService;

	@RequestMapping(path = "/api/movie", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> getAllMovie() {
		List<Movie> movie = movieService.findAllMovie();
		return new ResponseEntity<List<Movie>>(movie, HttpStatus.OK);
	}

	@RequestMapping(path = "/api/movie/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<MovieVO> getMovie(
			@PathVariable("movieId") String movieId) {
		Movie movie = movieService.getMovie(movieId);
		return new ResponseEntity<MovieVO>(Convertor.getMovieVo(movie),
				HttpStatus.OK);
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

	@RequestMapping(path = "/api/movie/{movieId}", method = RequestMethod.DELETE)
	public ResponseEntity<Movie> deleteMovie(
			@PathVariable("movieId") String movieId) {
		movieService.deleteMovie((movieId));
		return new ResponseEntity<Movie>(HttpStatus.OK);
	}

}
