package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseEach;

import java.util.Set;

public class L04_freefalldeneme01 extends TestBaseEach {


    @Test
    public void test01() {

        //● https://testotomasyonu.com/addremove/ adresine gidin.

        driver.get("https://testotomasyonu.com/addremove/");
        String ilkWHD = driver.getWindowHandle();

        //● Sayfadaki textin “Add/Remove Elements” olduğunu doğrulayın.

        WebElement h2 = driver.findElement(By.xpath("//h2"));
        String actualelement = h2.getText();
        String expectedElement = "Add/Remove Elements";

        Assertions.assertTrue(actualelement.contains(expectedElement));

        //● Sayfa başlığının(title) “Test Otomasyonu” icerdigini doğrulayın.

        WebElement titleCheck = driver.findElement(By.xpath("//*[text()='Test Otomasyonu']"));
        String exptectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(exptectedTitle, actualTitle);


        //● ’Please click for Electronics Products’ linkine tiklayin.iver.

driver.findElement(By.xpath("//a[text()='Electronics Products']")).click();
 String ikinciWDH=driver.getWindowHandle();

        //● Electronics sayfasinin acildigini test edin

        Set <String> tumWHD=driver.getWindowHandles();
        String setString="";

        for (String eachList : tumWHD) {
            if (! eachList.equals(tumWHD)){
                setString=eachList;
                driver.switchTo().window(ikinciWDH);

            }
        }


    }
}
