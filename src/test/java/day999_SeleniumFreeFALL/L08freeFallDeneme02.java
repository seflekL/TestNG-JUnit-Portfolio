package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L08freeFallDeneme02 extends TestBaseEach {

    @Test

    public void test01(){

        //https://testotomasyonu.com/javascriptAlert sayfasina gidin

        driver.get("https://testotomasyonu.com/javascriptAlert");

        // Click For JS alert butonuna basin

        driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();

        // alert'de cikan yazinin "I am a JS Alert" oldugunu test edin

        String exptectedAlertYazi="I am a JS Alert";
        String acutalALertYazi=driver.switchTo().alert().getText();
        System.out.println(acutalALertYazi);
        Assertions.assertEquals(exptectedAlertYazi,acutalALertYazi);
        ReusableMethods.bekle(2);

        // OK'e basarak alert'u kapatin
        driver.switchTo().alert().accept();

    }
}
