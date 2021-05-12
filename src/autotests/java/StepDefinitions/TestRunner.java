// Author: Khalid Mahmood
// Date: 11th May 2021

package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = {"./src/autotests/resources/Features"},     // Define where Feature Files are
            glue = {"StepDefinitions"},                            // Step Definitions that we want to use
            monochrome = true,                                     // Ensure console output format is readable
            plugin = {"pretty", "html:target/CucumberReports"})    // HTML result files to reside

public class TestRunner
{

}

