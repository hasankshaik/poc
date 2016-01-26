package uk.co.dev.parentalcontrol;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.domain.Movie;

@Transactional
public class ParentalControlTest extends AbstractTest {

	@Autowired
	ParentalControlService parentalControlService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		parentalControlService.createMovie(new Movie("ddlj", "12"));
		Assert.assertTrue(parentalControlService.isSuitableToWatch(
				ParentalControlLevel.FOR12, "ddlj").isCanWatch());
	}

}
