package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L01_freeFalldeneme01 extends TestBaseEach {

    @Test
    public  void test01(){
        // driiver gitsin

        driver.get("https://testotomasyonu.com/click");

          // dgi dronu sag tiklsain
        Actions actions=new Actions(driver);
        WebElement cgiDrones=driver.findElement(By.id("pic2_thumb"));
        ReusableMethods.bekle(1);
        actions.contextClick(cgiDrones).perform();

        //"Tebrikler!... Sağ click yaptınız."
        String expectedTest="Tebrikler!... Sağ click yaptınız.";
        String actualTest=driver.switchTo().alert().getText();



        Assertions.assertEquals(expectedTest,actualTest);

        // Alert ti kapatsin


        driver.switchTo().alert().accept();

        ReusableMethods.bekle(2);


    }
}
