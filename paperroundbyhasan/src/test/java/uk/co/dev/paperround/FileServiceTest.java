package uk.co.dev.paperround;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class FileServiceTest extends TestCase {


    private FileService fileService;

    @Before
    public void setUp() {
        fileService = new FileService();
    }

    @Test
    public void shouldReturnEmptyList_ReadEmptyFile() {
        assertTrue(fileService.getFile("empty.txt").size() == 0);
    }

    @Test
    public void shouldReturnListOfHouseNumber_ReadFile() {
        assertTrue(fileService.getFile("street1.txt").size() > 0);
    }

    @After
    public void tearDown() {
        fileService = null;
    }

}
