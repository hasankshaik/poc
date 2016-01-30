package uk.co.dev.parentalcontrol;

import uk.co.dev.domain.Movie;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;

public interface IMovieService {
	String getParentalControlLevel(String movieId)
			throws TitleNotFoundException, TechnicalFailureException;

	void saveMovie(Movie movie);
}