package uk.co.dev.parentalcontrol;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.dev.constants.ParentalControlLevel;

public class ParentalControlLevelTest {

	@Test
	public void test() {
		assertTrue(ParentalControlLevel.FOR12 == ParentalControlLevel.getParentalControlLevel(ParentalControlLevel.FOR12.getRating()));
		assertTrue(ParentalControlLevel.FOR15 != ParentalControlLevel.getParentalControlLevel(ParentalControlLevel.FOR12.getRating()));
	}

}
