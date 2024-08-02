package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ToFormPage {

    public ToFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "(//*[@class='form-control'])[3]")
    public WebElement gunDropdownElementi;

    @FindBy(xpath = "(//*[@class='form-control'])[4]")
    public WebElement ayDropdownElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[5]")
    public WebElement yilDropdownElementi;

    @FindBy(xpath = "(//*[@type='checkbox'])[5]")
    public WebElement sirtagrisiBoxElementi;

    @FindBy(xpath = "(//*[@type='checkbox'])[4]")
    public WebElement carpintiboxElementi;

    @FindBy(xpath = "(//*[@type='checkbox'])[9]")
    public WebElement sekerBoxElementi;

    @FindBy(xpath = "(//*[@type='checkbox'])[14]")
    public WebElement epilepsiBoxElementi;




}
