package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L06_freefalldeneme01 extends TestBaseEach {
    @Test

    public void test01 (){
        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());


        // Electronics linkine tiklayalim

        driver.findElement(By.xpath("(//a[text()='Electronics'])[3]")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());


        // ilk urune click yapalim

    driver.findElement(By.xpath("(//*[@class='prod-img'])[1]")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());

        driver.navigate().back();
        driver.navigate().back();
        System.out.println("ilk navigate.back 'den sonra "+ driver.getCurrentUrl()); // https://www.testotomasyonu.com/product/58
        System.out.println(driver.getWindowHandle()); // B3EAA570CB2910434B41A8E608AF22F2
        ReusableMethods.bekle(1);
        driver.navigate().back();
        System.out.println("ikinci navigate.back 'den sonra "+ driver.getCurrentUrl()); // https://www.testotomasyonu.com/product/58
        System.out.println(driver.getWindowHandle()); // B3EAA570CB2910434B41A8E608AF22F2


        ReusableMethods.bekle(3);


    }

}
