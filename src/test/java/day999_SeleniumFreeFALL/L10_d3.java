package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseEach;

public class L10_d3 extends TestBaseEach {

    @Test
    public void dropdowntet(){

        //1. http://zero.webappsecurity.com/ A sayfaa gidiniz

        driver.get("http://zero.webappsecurity.com/");
        //2. Sign in butonuna basin
        driver.findElement(By.id("signin_button")).click();
        //Login kutusuna “username” yazin
        WebElement usernamebox=driver.findElement(By.xpath("(//input[@id='user_login'])"));
        usernamebox.sendKeys("username");
        //4. Password kutusuna “password” yazin
        WebElement passwordbox=driver.findElement(By.xpath("(//input[@id='user_password'])"));
        passwordbox.sendKeys("password");
        //5. Sign in tusuna basin, back tusuna basarak sayfaya donun
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        //5. Sign in tusuna basin, back tusuna basarak sayfaya donun
        driver.navigate().back();
     //   6. Online banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.id("pay_bills_link")).click();
//8. “Currency” drop down menusunden Eurozone’u secin
        driver.findElement(By.xpath("//*[@class='ui-state-default ui-corner-top ui-tabs-selected ui-state-active']")).click();

        WebElement menuIndex=driver.findElement(By.name("currency"));
        Select menuDDM=new Select(menuIndex);
        menuDDM.selectByValue("EUR");
        //9. “amount” kutusuna bir sayi girin
 // som satirda hata war

        WebElement xamount= driver.findElement(By.xpath("//*[@id='pc_amount']"));
        xamount.sendKeys("20000");
//10. “US Dollars” in secilmedigini test edin
        WebElement dollarButton=driver.findElement(By.xpath("(//*[@class='radio inline'])[2]"));
        Assertions.assertFalse(dollarButton.isSelected());

      //  12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
      driver.findElement(By.id("pc_calculate_costs")).click();
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
        //kontrol edin
















    }
}
