package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L01_freeFalldeneme02 extends TestBaseEach {

    @Test

    public void test02 (){

        // driiver gitsin

        driver.get("https://testotomasyonu.com/click");

        // dgi dronu sag tiklsain

        WebElement dgibbox=driver.findElement(By.id("pic2_thumb"));

        Actions actions=new Actions(driver);
        ReusableMethods.bekle(1);
        actions.contextClick(dgibbox).perform();

        //"Tebrikler!... Sağ click yaptınız."
        String expectedtitle="Tebrikler!... Sağ click yaptınız.";
        String actualTitle=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        Assertions.assertEquals(expectedtitle,actualTitle);


    }

}
