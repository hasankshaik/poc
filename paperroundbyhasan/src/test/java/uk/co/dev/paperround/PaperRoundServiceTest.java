package uk.co.dev.paperround;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class PaperRoundServiceTest extends TestCase {


    private PaperRoundService paperRoundService;


    @Before
    public void setUp() {
        paperRoundService = new PaperRoundService(new FileService());
    }

    @Test
    public void shouldReturnReport_ValidityOfFile_AsFalse() {
        assertFalse(paperRoundService.getReport("empty.txt").isValid());
    }

    @Test
    public void shouldReport_ValidityOfFile() {
        assertTrue(paperRoundService.getReport("street1.txt").isValid());
    }

    @Test
    public void shouldReport_NumberOfHouses_InAStreet() {
        assertTrue(paperRoundService.getReport("street1.txt").getNoOfHousesInAStreet() == 14);
    }

    @Test
    public void shouldReport_NumberOfHouses_InNorthOfAStreet() {
        assertTrue(paperRoundService.getReport("street1.txt").getNoOfHousesInNorthSideOfStreet() == 8);
    }

    @Test
    public void shouldReport_NumberOfHouses_InSouthOfAStreet() {
        assertTrue(paperRoundService.getReport("street1.txt").getNoOfHousesInSouthSideOfStreet() == 6);
    }
    @Test
    public void shouldHaveInDeliveryReport_OrderOfHouses_LinearAproach() {
        List<Integer> orderOfHouse=paperRoundService.getDeliveryReportLinearAproach("street1.txt").getOrderOfHouse();
        assertTrue(orderOfHouse.get(0) == 1);
        assertTrue(orderOfHouse.get(1) == 3);
        assertTrue(orderOfHouse.get(2) == 5);
        assertTrue(orderOfHouse.get(orderOfHouse.size()-1) == 2);
    }

    @Test
    public void shouldHaveInDeliveryReport_NoOfTimesRoadCrosing_LinearAproach() {
        assertTrue(paperRoundService.getDeliveryReportLinearAproach("street1.txt").getNoOfTimeRoadCrosed() == 2);
    }

    @Test
    public void shouldHaveInDeliveryReport_OrderOfHouses_ZigZagAproach() {
        List<Integer> orderOfHouse=paperRoundService.getDeliveryReportZigzagAproach("street1.txt").getOrderOfHouse();
        assertTrue(orderOfHouse.get(0) == 1);
        assertTrue(orderOfHouse.get(1) == 2);
        assertTrue(orderOfHouse.get(2) == 3);
        assertTrue(orderOfHouse.get(orderOfHouse.size()-1) == 15);
    }

    @Test
    public void shouldHaveInDeliveryReport_NoOfTimesRoadCrosing_ZigZagAproach() {
        assertTrue(paperRoundService.getDeliveryReportZigzagAproach("street1.txt").getNoOfTimeRoadCrosed() == 6);
    }
    @After
    public void tearDown() {
        paperRoundService = null;
    }

}
