package uk.co.dev.parentalcontrol;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.dev.constants.Messages;
import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.exceptions.TechnicalFailureException;
import uk.co.dev.exceptions.TitleNotFoundException;
import uk.co.dev.response.ResponceObj;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class ParentalControlServiceTest extends TestCase {
	private static String movieName = "Spectre";
	private static String movieRating = "15";
	@Mock
	MovieService movieServiceMock;

	@InjectMocks
	ParentalControlService parentalService;

	@Test
	public void testIsSuitableToWatchWhenRatingIsEqual() throws TitleNotFoundException, TechnicalFailureException {
		when(movieServiceMock.getParentalControlLevel(movieName)).thenReturn(movieRating);
		final ResponceObj result = parentalService.isSuitableToWatch(ParentalControlLevel.FOR15, movieName);
		assertNotNull(result);
		assertTrue(result.isCanWatch());
		assertTrue(Messages.ENJOY_THE_MOVIE == result.getMessage());
		verify(movieServiceMock, times(1)).getParentalControlLevel(movieName);
	}

	@Test
	public void testIsSuitableToWatchWhenPreferenceRatingIsLess() throws TitleNotFoundException, TechnicalFailureException {
		when(movieServiceMock.getParentalControlLevel(movieName)).thenReturn(movieRating);
		final ResponceObj result = parentalService.isSuitableToWatch(ParentalControlLevel.U, movieName);
		assertNotNull(result);
		assertFalse(result.isCanWatch());
		assertTrue(Messages.NOT_SUITABLE == result.getMessage());
		verify(movieServiceMock, times(1)).getParentalControlLevel(movieName);
	}

	@Test
	public void testIsSuitableToWatchWhenPreferenceRatingIsMore() throws TitleNotFoundException, TechnicalFailureException {
		when(movieServiceMock.getParentalControlLevel(movieName)).thenReturn(movieRating);
		final ResponceObj result = parentalService.isSuitableToWatch(ParentalControlLevel.FOR18, movieName);
		assertNotNull(result);
		assertTrue(result.isCanWatch());
		assertTrue(Messages.ENJOY_THE_MOVIE == result.getMessage());
		verify(movieServiceMock, times(1)).getParentalControlLevel(movieName);
	}

	@Test
	public void testIsSuitableToWatchWhenMovieTileNotfound() throws TitleNotFoundException, TechnicalFailureException {
		when(movieServiceMock.getParentalControlLevel(movieName)).thenThrow(new TitleNotFoundException());
		final ResponceObj result = parentalService.isSuitableToWatch(ParentalControlLevel.FOR18, movieName);
		assertNotNull(result);
		assertFalse(result.isCanWatch());
		assertTrue(Messages.TITLE_NOT_FOUND == result.getMessage());
		verify(movieServiceMock, times(1)).getParentalControlLevel(movieName);
	}

	@Test
	public void testIsSuitableToWatchWhenTechnicalFailureException() throws TitleNotFoundException, TechnicalFailureException {
		when(movieServiceMock.getParentalControlLevel(movieName)).thenThrow(new TechnicalFailureException());
		final ResponceObj result = parentalService.isSuitableToWatch(ParentalControlLevel.FOR18, movieName);
		assertNotNull(result);
		assertFalse(result.isCanWatch());
		assertTrue(Messages.TECHNICAL_FAILURE == result.getMessage());
		verify(movieServiceMock, times(1)).getParentalControlLevel(movieName);
	}
}
