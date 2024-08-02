package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniveristyPage {

    public WebUniveristyPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//*[text()='LOGIN PORTAL']")
    public WebElement loginPortalElementi;

    @FindBy (xpath = "//*[@id='text']")
    public WebElement usernameBoxElementi;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passBoxElementi;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginBoxElementi;

}
