package tests.day14;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class L05_FormDoldurma {
    @Test
    public void form (){
        ToFormPage toFormPage=new ToFormPage();

        //1 - https://testotomasyonu.com/form adresine gidin

        Driver.getDriver().get(ConfigReader.getProperty("tourlform"));

        //2- Sirt Agrisi ve Carpinti checkbox’larini secin


        // eger webelementler sayfada gorunmuyorsa once onlara scrool yapalim

        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",toFormPage.carpintiboxElementi);
        ReusableMethods.bekle(1);
        toFormPage.carpintiboxElementi.click();
        toFormPage.sirtagrisiBoxElementi.click();

        //4- Seker ve Epilepsi checkbox’larininin seçili olmadigini test edin
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",toFormPage.sekerBoxElementi);
        ReusableMethods.bekle(1);
        Assert.assertFalse(toFormPage.sekerBoxElementi.isSelected());
        Assert.assertFalse(toFormPage.epilepsiBoxElementi.isSelected());

        Driver.quitDriver();









    }
}
