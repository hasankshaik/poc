package uk.co.dev.paperround.stepdefination;

import cucumber.api.java.en.When;
import junit.framework.TestCase;
import uk.co.dev.paperround.FileService;
import uk.co.dev.paperround.PaperRoundService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uk.co.dev.report.DeliveryReport;

import java.util.List;

public class DeliveryReportSteps extends TestCase {

    private PaperRoundService paperRoundService;
    private DeliveryReport deliveryReportLinear;
    private DeliveryReport deliveryReportZigZag;

    @Given("^a street$")
    public void a_street() throws Throwable {
        paperRoundService = new PaperRoundService(new FileService());
    }

    @When("^the boy is delivering papers from west to east delivering to the houses on the left hand \\(north\\) side of the street and then east to west$")
    public void the_boy_is_delivering_papers_from_west_to_east_delivering_to_the_houses_on_the_left_hand_north_side_of_the_street_and_then_east_to_west() throws Throwable {
        deliveryReportLinear =paperRoundService.getDeliveryReportLinearAproach("street1.txt");
    }

    @Then("^list the house numbers in the order that I will be delivering to$")
    public void list_the_house_numbers_in_the_order_that_I_will_be_delivering_to() throws Throwable {
        List<Integer> orderOfHouse= deliveryReportLinear.getOrderOfHouse();
        assertTrue(orderOfHouse.get(0) == 1);
        assertTrue(orderOfHouse.get(1) == 3);
        assertTrue(orderOfHouse.get(2) == 5);
        assertTrue(orderOfHouse.get(orderOfHouse.size()-1) == 2);
    }

    @Then("^how many times I will have to cross the road from one side to the other to make my deliveries$")
    public void how_many_times_I_will_have_to_cross_the_road_from_one_side_to_the_other_to_make_my_deliveries() throws Throwable {
        assertTrue(deliveryReportLinear.getNoOfTimeRoadCrosed() == 2);
    }

    @When("^the boy is delivering papers to each house in turn from west to east, regardless of which side of the road they are on\\.$")
    public void the_boy_is_delivering_papers_to_each_house_in_turn_from_west_to_east_regardless_of_which_side_of_the_road_they_are_on() throws Throwable {
        deliveryReportZigZag =paperRoundService.getDeliveryReportZigzagAproach("street1.txt");
    }

    @Then("^list the house numbers in the order that I will be delivering zigzag$")
    public void list_the_house_numbers_in_the_order_that_I_will_be_delivering_to_zigzag() throws Throwable {
        List<Integer> orderOfHouse= deliveryReportZigZag.getOrderOfHouse();
        assertTrue(orderOfHouse.get(0) == 1);
        assertTrue(orderOfHouse.get(1) == 2);
        assertTrue(orderOfHouse.get(2) == 3);
        assertTrue(orderOfHouse.get(orderOfHouse.size()-1) == 15);
    }

    @Then("^how many times I will have to cross the road from one side to the other to make my deliveries zigzag$")
    public void how_many_times_I_will_have_to_cross_the_road_from_one_side_to_the_other_to_make_my_deliveries_zigzag() throws Throwable {
        assertTrue(deliveryReportZigZag.getNoOfTimeRoadCrosed() == 6);
    }


}