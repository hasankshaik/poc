package uk.co.dev.parentalcontrol;

import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;

public interface MovieService {
	String getParentalControlLevel(String movieId)
			throws TitleNotFoundException, TechnicalFailureException;
}