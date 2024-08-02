package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L03_freeFall_denemeler01 extends TestBaseEach {

    @Test
    public void test01 () {

        //1- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");

        //2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune
        // getirin

        WebElement kidsMenu=driver.findElement(By.partialLinkText("Kids Wear"));

        Actions actions= new Actions(driver);
        actions.moveToElement(kidsMenu).perform();


        //3- “Boys” linkine basin

        driver.findElement(By.partialLinkText("Boys")).click();


        ReusableMethods.bekle(3);

        //4- Acilan sayfadaki ilk urunu tiklayin
driver.findElement(By.className("lazy")).click();

        //5- Acilan sayfada urun isminin “Boys Shirt White Color”
        // oldugunu test edin

String expectedTitle="Boys Shirt White Color";
WebElement shirtElement=driver.findElement(By.xpath("//*[@class=' heading-sm mb-4']"));
String actualTitle=shirtElement.getText();

        Assertions.assertEquals(expectedTitle,actualTitle);

        ReusableMethods.bekle(3);


    }
}
