// Author: Khalid Mahmood
// Date: 11th May 2021

package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import Utilities.*;

import PageObjectModel.*;

public class TestScenario_CarTaxCheck
{
    private List<String> carRegNumbers;
    private List<String> carDetailsFromUI;
    private List<String> carDetailsFromOutputFile;
    private WebDriver driver;
    private pageHomepage Homepage;
    private pageSearch Search;
    private pageCarDetails CarDetails;

    @Given("I read the vehicle registration details from input text file")
    public void readInputTextFile() throws IOException
    {
        readSingleInputFile input = new readSingleInputFile();
        input.readFromCarInputFile();
        carRegNumbers = input.getinputarray();
    }

    @When("I search a registration number on Car Tax Check website")
    public void launchAndSearchRegNo()
    {
        Homepage = new pageHomepage();
        Search = new pageSearch();

        Homepage.setUp();
        Homepage.launchPage();

        ListIterator<String> listIterator = carRegNumbers.listIterator();

        // Iterate through carRegNumbers list
        while(listIterator.hasNext())
        {
            String regNo = listIterator.next();

            // Enter Car Reg and click on Free Car Check button
            Search.enterRegNumber(regNo);
            Search.clickFreeCarCheck();

            // Add details from application UI to a list  ***** Not implemented due to less time *****
        }
    }

    @And("I read the vehicle details from the output text file")
    public void readOutputTextFile() throws IOException
    {
        readOutputFile output = new readOutputFile();
        carDetailsFromOutputFile = output.outarray();
    }

    @Then("Details on website should match the details in output text file")
    public void verifyCarDetails()
    {
        // Compare details from output file with list of details extracted from UI  ***** Not implemented due to less time *****
    }
}
