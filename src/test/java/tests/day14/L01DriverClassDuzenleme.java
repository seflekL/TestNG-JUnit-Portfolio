package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class L01DriverClassDuzenleme {

    // testotomasyonu anasayfaya gidin3

    @Test

    public void test01(){

        // testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // url'in testotomasyonu icerdigini test edin

        String expectedUrl="testotomasyonu";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


        Driver.driver.quit();
    }

}
