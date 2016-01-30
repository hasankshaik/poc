package uk.co.dev.parentalcontrol.api;

import uk.co.dev.domain.Movie;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;

public interface IMovieService {
	void saveMovie(Movie movie);

	Movie getMovie(Long movie);

	void updateMovie(Movie movie);

	void deleteMovie(Long movie);
}