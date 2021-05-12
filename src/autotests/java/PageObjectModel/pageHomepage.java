// Author: Khalid Mahmood
// Date: 11th May 2021

package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class pageHomepage
{
    // Initialise
    public String driverLocation;
    public WebDriver driver = null;

    // Set page url
    public String pageURL = "https://cartaxcheck.co.uk/";

    public void setUp()
    {
        // Select driver we want to use e.g. in this example we will use Chrome driver.
        // Can write further code to have different options to use different browser types
        driverLocation = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverLocation + "/src/autotests/resources/Drivers/chromedriver");
    }

    // Launch webpage and maximise it
    public void launchPage()
    {
        // Use driver to launch url
        WebDriver driver = new ChromeDriver();
        driver.get(pageURL);

        // Maximise page window
        driver.manage().window().maximize();
    }

    // Close browser
    public void close()
    {
        driver.close();
    }

    // Clear driver object
    public void quitDriver()
    {
        driver.quit();
    }
}
