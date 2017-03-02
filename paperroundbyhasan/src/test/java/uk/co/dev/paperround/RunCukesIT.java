package uk.co.dev.paperround;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author hshaik
 */

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "uk.co.dev.paperround" } ,plugin = { "pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport-groupone" }, strict = true)
public class RunCukesIT {
}
