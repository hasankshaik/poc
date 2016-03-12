package uk.co.dev.parentalcontrol.api;

import java.util.List;

import uk.co.dev.domain.Movie;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;

public interface IMovieService {
	void saveMovie(Movie movie);

	Movie getMovie(String movie);

	void updateMovie(Movie movie);

	void deleteMovie(String movie);

	List<Movie> findAllMovie();
}