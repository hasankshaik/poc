package uk.co.dev.parentalcontrol;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@Transactional
public class RestControllerTest extends AbstractControllerTest {

	@Autowired
	ParentalControlService parentalControlService;

	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
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
