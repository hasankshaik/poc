package uk.co.dev.parentalcontrol;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import uk.co.dev.domain.Movie;
import uk.co.dev.parentalcontrol.base.AbstractTest;

@Transactional
public class ParentalControlTest extends AbstractTest {

	@Autowired
	MovieRestControl parentalControlService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Ignore
	public void test() {
		parentalControlService.createMovie(new Movie("ddlj", "12"));
//		Assert.assertTrue(parentalControlService.isSuitableToWatch(
//				ParentalControlLevel.FOR12, "ddlj").isCanWatch());
	}

}
