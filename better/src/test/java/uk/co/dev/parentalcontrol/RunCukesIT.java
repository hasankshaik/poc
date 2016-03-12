package uk.co.dev.parentalcontrol;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author hshaik
 */

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "uk.co.dev.parentalcontrol" } ,plugin = { "pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport-groupone" }, strict = true)
public class RunCukesIT {
}
