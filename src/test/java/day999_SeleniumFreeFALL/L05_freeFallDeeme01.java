package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseEach;

public class L05_freeFallDeeme01 extends TestBaseEach {


    @Test
    public void test02(){



        //	- https://testotomasyonu.com/javascriptAlert adresine gidin

        driver.get("https://testotomasyonu.com/javascriptAlert");

        //	- 2.alert'e tiklayalim

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //	- Cancel'a basip,

        driver.switchTo().alert().dismiss();

        //	cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin

        String exptectedText="You clicked: Cancel";

        WebElement sonucElementi = driver.findElement(By.id("result"));

        String actualText=sonucElementi.getText();

        Assertions.assertEquals(exptectedText,actualText);


    }

    @Test

    public void test03(){

        //	- https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");
        //	- 3.alert'e tiklayalim

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //	- Cikan prompt ekranina "Levent" yazdiralim

        driver.switchTo().alert().sendKeys("Levent");

        //	- OK tusuna basarak alert'i kapatalim

        driver.switchTo().alert().accept();

        //Cikan sonuc yazisinin Levent icerdigini test edelim

        WebElement sonucElementi = driver.findElement(By.id("result"));

        String expectedText="Levent";
        String actualTEst= sonucElementi.getText();

        Assertions.assertNotEquals(expectedText,actualTEst);
    }


}
