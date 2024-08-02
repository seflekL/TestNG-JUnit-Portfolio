package day999_SeleniumFreeFALL;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L27_formdoldurma extends TestBaseEach {
    @Test

    public void test01() {

        //        //1- https://www.testotomasyonu.com adresine gidelim

        driver.get("https://www.testotomasyonu.com");

        //2- Account linkine tiklayin

        driver.findElement(By.xpath("(//*[@class='menu-icon-text'])[1]")).click();

        //3- Sign Up linkine basalim

        driver.findElement(By.xpath("//*[text()=' Sign Up']")).click();

        //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim
        Faker faker = new Faker();
        String username = faker.internet().emailAddress();
        String password = faker.internet().password();


        WebElement firstnameKutusu = driver.findElement(By.id("firstName"));
        Actions actions = new Actions(driver);
        ReusableMethods.bekle(1);
        actions.click(firstnameKutusu)
                .sendKeys(faker.backToTheFuture().character().toLowerCase())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.backToTheFuture().character())
                .sendKeys(Keys.TAB)
                .sendKeys(username)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys(password).perform();
        ReusableMethods.bekle(1);

        Actions actions2 = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(1);

        driver.findElement(By.id("btn-submit-form")).click();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN).perform();


        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        ReusableMethods.bekle(3);
        driver.findElement(By.id("submitlogin")).click();
        ReusableMethods.bekle(2);


        WebElement logoutBoxElement = driver.findElement(By.xpath("(//*[text()='Logout'])[2]"));
        Assertions.assertTrue(logoutBoxElement.isDisplayed());

        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(2);

driver.findElement(By.xpath("(//*[@class='item'])[6]")).click();
        ReusableMethods.bekle(2);


    }


}
