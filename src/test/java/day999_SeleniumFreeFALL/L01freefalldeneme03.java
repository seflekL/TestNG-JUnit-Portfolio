package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L01freefalldeneme03 extends TestBaseEach {

    @Test

    public void test03(){




        // driiver gitsin

        driver.get("https://testotomasyonu.com/click");

        // dgi dronu sag tiklsain

        WebElement dgi= driver.findElement(By.id("pic2_thumb"));
        Actions actions=new Actions(driver);
        ReusableMethods.bekle(1);
        actions.contextClick(dgi).perform();

        //        //"Tebrikler!... Sağ click yaptınız."

        String expectedText="Tebrikler!... Sağ click yaptınız.";
        String actualtext=driver.switchTo().alert().getText();

        Assertions.assertEquals(expectedText,actualtext);

        driver.switchTo().alert().accept();


    }
}
