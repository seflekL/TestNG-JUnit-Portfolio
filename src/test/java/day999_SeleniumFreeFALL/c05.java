package day999_SeleniumFreeFALL;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class c05 extends TestBaseEach {

    @Test
    public void test01() {

        //https://testotomasyonu.com/addremove/ adresine gidin.

        driver.get("https://testotomasyonu.com/addremove/");
        String windowWHD = driver.getWindowHandle();
        //Please click for Electronics Products’ linkine tiklayin.

        driver.findElement(By.xpath("//*[text()='Electronics Products']")).click();


        String hedefUrl = "https://testotomasyonu.com/category/7/products";

        ReusableMethods.switchWindowByUrl(driver, "https://testotomasyonu.com/category/7/products");

        String expextedURL = "https://testotomasyonu.com/category/7/products";
        String actualURL = driver.getCurrentUrl();

        Assertions.assertEquals(expextedURL, actualURL);
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(windowWHD);
        System.out.println(driver.getCurrentUrl());

        String expectedUrl="https://testotomasyonu.com/addremove/";
        actualURL= driver.getCurrentUrl();

        Assertions.assertEquals(expectedUrl,actualURL);

        //Url’in addremove icerdigini test edin

        String expectedWORD="addremove";
        actualURL=driver.getCurrentUrl();
        Assertions.assertTrue(actualURL.contains(expectedWORD));
    }
}
