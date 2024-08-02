package tests.day14;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class L02_PageClassDuzenleme {

    @Test

    public void test01(){
        // Testotomasyonu anasayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // phone icin arama yapin

        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();

        testOtomasyonuPage.searchboxElementi.sendKeys(ConfigReader.getProperty("toAranacakKelime"));
        testOtomasyonuPage.searchboxElementi.sendKeys(Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin
        int actualaramasonucList=testOtomasyonuPage.aramaSonucList.size();

        System.out.println(actualaramasonucList);
        Assert.assertTrue(actualaramasonucList>0);

        Driver.driver.quit();
    }
}
