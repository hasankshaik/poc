package uk.co.dev.parentalcontrol;

import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;
import uk.co.dev.response.ResponceObj;

public interface IParentalControlService {

	public abstract ResponceObj isSuitableToWatch(
			ParentalControlLevel customerPreferenceLevel, String movieId)
			throws TitleNotFoundException, TechnicalFailureException;

	public abstract ResponceObj canWatch(String movieId);

}