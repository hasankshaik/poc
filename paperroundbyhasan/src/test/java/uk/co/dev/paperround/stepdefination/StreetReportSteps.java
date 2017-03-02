package uk.co.dev.paperround.stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Before;
import uk.co.dev.paperround.FileService;
import uk.co.dev.paperround.PaperRoundService;
import uk.co.dev.report.StreetReport;

public class StreetReportSteps extends TestCase {

    private PaperRoundService paperRoundService;
    private StreetReport streetReport;


    @Given("^a street specification file$")
    public void a_street_specification_file() throws Throwable {
        paperRoundService = new PaperRoundService(new FileService());
    }

    @When("^a report is generated$")
    public void a_report_is_generated() throws Throwable {
        streetReport = paperRoundService.getReport("street1.txt");
    }

    @Then("^report should show  the file is valid$")
    public void report_should_show_the_file_is_valid() throws Throwable {
        assertTrue(streetReport.isValid());
    }

    @Then("^report should show number of houses in a given street$")
    public void report_should_show_number_of_houses_in_a_given_street() throws Throwable {
        assertTrue(streetReport.getNoOfHousesInAStreet() == 14);
    }

    @Then("^number of houses are on the left hand \\(north\\) side of the street$")
    public void number_of_houses_are_on_the_left_hand_north_side_of_the_street() throws Throwable {
        assertTrue(streetReport.getNoOfHousesInNorthSideOfStreet() == 8);
    }

    @Then("^number of houses are on the right hand \\(south\\) side of the street$")
    public void number_of_houses_are_on_the_right_hand_south_side_of_the_street() throws Throwable {
        assertTrue(streetReport.getNoOfHousesInSouthSideOfStreet() == 6);
    }
}