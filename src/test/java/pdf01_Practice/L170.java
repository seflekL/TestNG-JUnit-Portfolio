package pdf01_Practice;

import org.junit.jupiter.api.Test;
import utilities.TestBaseEach;

public class L170 extends TestBaseEach {

    @Test
    public void test01 (){

//1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

////2. “Our Products” butonuna basin
//
//    WebElement  webelemen= driver.findElement(By.xpath("//*[text()='Our Products']"));
//
//    driver.switchTo().frame(webelemen);
//
//
//
//
////3. “Cameras product”i tiklayin
//
//driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a")).click();
//
//
////4. Popup mesajini yazdirin
//
//        System.out.println(driver.switchTo().alert().getText());
////5. “close” butonuna basin
//        driver.switchTo().alert().dismiss();
////6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
//        driver.findElement(By.xpath("(//li)[5]")).click();
////7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
//
//
//    String exptectedUrl="http://webdriveruniversity.com/index.html";
//    String actualUrl=driver.getCurrentUrl();
//
//        Assertions.assertEquals(exptectedUrl,actualUrl);
   }
}
