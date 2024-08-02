package tests.day14;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniveristyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.ResultSet;

public class L06_WebUniversityTesti {

    @Test
    public void test01 () {
        WebUniveristyPage webUniveristyPage=new WebUniveristyPage();
        Faker faker=new Faker();
        Driver.getDriver().get(ConfigReader.getProperty("towebUni"));

        //2."Login Portal" a  kadar asagi inin

        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",webUniveristyPage.loginPortalElementi);
        ReusableMethods.bekle(1);

        //3."Login Portal" a tiklayin

        webUniveristyPage.loginPortalElementi.click();

        ReusableMethods.bekle(3);


        //4.Diger window'a gecin

        ReusableMethods.switchWindowByUrl(Driver.getDriver(),"https://webdriveruniversity.com/Login-Portal/index.html");

        //5."username" ve  "password" kutularina fake deger yazdirin

        webUniveristyPage.usernameBoxElementi.sendKeys(faker.backToTheFuture().character());
        webUniveristyPage.passBoxElementi.sendKeys(faker.internet().password());
        webUniveristyPage.loginBoxElementi.click();


        ReusableMethods.bekle(3);
        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin

       String expectedAlert="validation failed";
       String actualAlert=Driver.getDriver()
               .switchTo().alert()
               .getText();

        Assert.assertEquals(expectedAlert,actualAlert);

        //8.Ok diyerek Popup'i kapatin
        Driver.driver.switchTo().alert().accept();
        ReusableMethods.bekle(1);

        //9.Ilk windowa geri donun
        ReusableMethods.switchWindowByUrl(Driver.getDriver() , "https://webdriveruniversity.com/");
        //10-ilk Url oldugumnu test edinm
        String expectedUrl="https://webdriveruniversity.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

        Driver.quitDriver();







    }
}
