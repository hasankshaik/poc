package uk.co.dev.parentalcontrol;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@Transactional
public class MockRestControllerTest extends AbstractControllerTest {

	@Mock
	private MovieService movieService;

	@InjectMocks
	MovieRestControl parentalControlService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		setUp(parentalControlService);
	}

	@Test
	@Ignore
	public void test() throws Exception {

		String uri = "/api/canwatch/{movieId}";
		String movieId = "spectre";


		MvcResult result = mockMvc.perform(
				MockMvcRequestBuilders.get(uri, movieId).accept(
						MediaType.APPLICATION_JSON_VALUE)).andReturn();

		String contect = result.getResponse().getContentAsString();

	}

}
