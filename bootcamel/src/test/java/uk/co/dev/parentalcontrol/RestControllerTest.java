package uk.co.dev.parentalcontrol;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import uk.co.dev.parentalcontrol.base.AbstractControllerTest;

@Transactional
public class RestControllerTest extends AbstractControllerTest {

	@Autowired
	MovieRestControl parentalControlService;

	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	@Ignore
	public void test() throws Exception {
		
		String uri = "/api/canwatch/{movieId}";
		String movieId = "spectre";
		MvcResult result = mockMvc.perform(
				MockMvcRequestBuilders	
						.get(uri, movieId).accept(
								MediaType.APPLICATION_JSON_VALUE)).andReturn();
		String contect = result.getResponse().getContentAsString();
		Assert.assertEquals(result.getResponse().getStatus(), 200);
	}

}
