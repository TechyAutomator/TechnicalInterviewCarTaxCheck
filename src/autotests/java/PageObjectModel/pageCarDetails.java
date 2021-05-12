// Author: Khalid Mahmood
// Date: 11th May 2021

package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageCarDetails
{
    @FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[1]/dd")
    private WebElement CarRegistration;

    @FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[2]/dd")
    private WebElement Make;

    @FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[3]/dd")
    private WebElement Model;

    @FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[4]/dd")
    private WebElement Color;

    @FindBy(xpath = "//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[5]/dd")
    private WebElement Year;

    @FindBy (className = "jsx-3575988842")
    private WebElement HomepageLink;

    // Get Car Registration info from page
    public String getCarRegistration()
    {
        return this.CarRegistration.getText();
    }

    // Get Car Make info from page
    public String getCarMake()
    {
        return this.Make.getText();
    }

    // Get Car Model info from page
    public String getCarModel()
    {
        return this.Model.getText();
    }

    // Get Car Color info from page
    public String getCarColor()
    {
        return this.Color.getText();
    }

    // Get Car Year info from page
    public String getCarYear()
    {
        return this.Year.getText();
    }

    // Click on home link to get to initial page
    public void clickHomepageLink()
    {
        this.HomepageLink.click();;
    }
}
