package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestOtomasyonuPage {

    public TestOtomasyonuPage (){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(id = "global-search")
    public WebElement searchboxElementi;

    @FindBy(xpath = "//*[@class='product-detail mb-3']")
    public List<WebElement> aramaSonucList;


}
