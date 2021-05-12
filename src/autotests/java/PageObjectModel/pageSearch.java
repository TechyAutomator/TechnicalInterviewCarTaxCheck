// Author: Khalid Mahmood
// Date: 11th May 2021

package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageSearch
{
    // Locate Enter Registration field
    @FindBy(id = "vrm-input")
    private WebElement elementRegNumber;

    // Locate Free Car Check button
    @FindBy(className = "jsx-3655351943")
    private WebElement btnFreeCarCheck;

    // Enter Car Registration number into field
    public void enterRegNumber(String sRegNumber)
    {
        this.elementRegNumber.sendKeys(sRegNumber);
    }

    // Click on Free Car Check button
    public void clickFreeCarCheck()
    {
        this.btnFreeCarCheck.click();
    }
}
