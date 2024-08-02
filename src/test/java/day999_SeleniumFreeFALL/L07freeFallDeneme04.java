package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBaseEach;

public class L07freeFallDeneme04 extends TestBaseEach {

    @Test

    public void test01(){

        //https://testotomasyonu.com/javascriptAlert sayfasina gidin

        driver.get("https://testotomasyonu.com/javascriptAlert");
        // Click For JS alert butonuna basin
driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        // alert'de cikan yazinin "I am a JS Alert" oldugunu test edin
String expectedText="I am a JS Alert";
String actualText=driver.switchTo().alert().getText();

        Assertions.assertEquals(expectedText,actualText);
        // OK'e basarak alert'u kapatin
driver.switchTo().alert().accept();




    }









}
