package uk.co.dev.parentalcontrol;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import uk.co.dev.constants.ParentalControlLevel;
import uk.co.dev.response.ResponceObj;

@Transactional
public class MockRestControllerTest extends AbstractControllerTest {

	@Mock
	private MovieService movieService;

	@InjectMocks
	ParentalControlService parentalControlService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		setUp(parentalControlService);
	}

	@Test
	public void test() throws Exception {

		String uri = "/api/canwatch/{movieId}";
		String movieId = "spectre";

		Mockito.when(movieService.getParentalControlLevel(movieId)).thenReturn(
				ParentalControlLevel.FOR18.getRating());

		MvcResult result = mockMvc.perform(
				MockMvcRequestBuilders.get(uri, movieId).accept(
						MediaType.APPLICATION_JSON_VALUE)).andReturn();

		String contect = result.getResponse().getContentAsString();

		System.out.println(contect);
		Assert.assertEquals(result.getResponse().getStatus(), 200);
		Assert.assertFalse(mapFromJson(contect, ResponceObj.class).isCanWatch());
	}

}
