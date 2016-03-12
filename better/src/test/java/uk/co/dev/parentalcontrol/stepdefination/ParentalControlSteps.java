package uk.co.dev.parentalcontrol.stepdefination;

import static org.mockito.Mockito.when;
import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.dev.constants.Messages;
import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;
import uk.co.dev.parentalcontrol.MovieService;
import uk.co.dev.parentalcontrol.ParentalControlService;
import uk.co.dev.response.ResponceObj;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParentalControlSteps extends TestCase {

	ParentalControlService hearingService = new ParentalControlService();

	@Given("^The Movie title is available for viewing$")
	public void the_Movie_title_is_available_for_viewing() throws Throwable {
		// Do nothing
	}

	@Then("^customer with \"(.*?)\" request to watch the movie \"(.*?)\" with rating \"(.*?)\" gets a message \"(.*?)\"$")
	public void customer_with_request_to_watch_the_movie_with_rating_gets_a_message(String customerPreference, String movieName,
			String movieRating, String message) throws Throwable {
		hearingService.setMovieService(new MovieService() {

			@Override
			public String getParentalControlLevel(String movieId) throws TitleNotFoundException, TechnicalFailureException {
				if (movieId.equals("TitleNotFoundException"))
					throw new TitleNotFoundException();
				if (movieId.equals("TechnicalFailureException"))
					throw new TechnicalFailureException();
				return movieRating;
			}
		});
		final ResponceObj result = hearingService.isSuitableToWatch(ParentalControlLevel.getParentalControlLevel(customerPreference),
				movieName);
		assertTrue(message.equalsIgnoreCase(result.getMessage().getDescription()));
	}
}