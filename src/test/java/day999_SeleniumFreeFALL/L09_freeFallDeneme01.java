package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseEach;

import java.util.List;

public class L09_freeFallDeneme01 extends TestBaseEach {


    @Test

    public void test01() {

        //1- https://testotomasyonu.com/discount adresine gidin

        driver.get("https://testotomasyonu.com/discount");

        //2- Elektronics Products yazisinin gorunur olduğunu test edin
        // Elektronics product bir iframe icinde oldugundan once
        // o iframe'e gecis yapmaliyiz

        WebElement iframetest = driver.findElement(By.xpath("(//iframe)[1]"));
        driver.switchTo().frame(iframetest);
        WebElement textTest = driver.findElement(By.xpath("//*[text()='Electronics Products']"));

        Assertions.assertTrue(textTest.isDisplayed());

        //3- Dell bilgisayar urun isminin ‘DELL Core I3 11th Gen’ olduğunu test edin

        WebElement dellElementi = driver.findElement(By.id("pictext1"));

        String expectedText = "DELL Core I3 11th Gen";
        String actualText = dellElementi.getText();

        Assertions.assertEquals(expectedText, actualText);

        //4- Sagdaki bolumde gorunen urunler arasinda
        // ‘Men Slim Fit’ içeren en az 1 urun olduğunu test edin
        // sagdaki fashion bolumu ayri bir iframe oldugundan once o iframe'e gecis yapmaliyiz
        // burada dikkat edecegimiz konu biz soldaki iframe'in icinde oldugumuzdan
        // sagdaki iframe'e gecis yapabilmek icin once anasayfaya donmeliyiz

        driver.switchTo().defaultContent();
        WebElement fashionIFrame = driver.findElement(By.xpath("(//iframe)[2]"));
        driver.switchTo().frame(fashionIFrame);

       // Men Slim Fit Yazisi elementlere ait textlerin icinde geciyor
        // testi yapabilmek icin, tum urunleri tek tek ele almali
        // ve isminde Men Slim Fit geciyor mu diye kontrol etmeliyiz

        List<WebElement> elementlost=driver.findElements(By.xpath("//*[@class='overlay']"));
        for (WebElement eacElement : elementlost) {
            System.out.println(eacElement.getText());

            String exptectedText="Men Slim Fit";
            String  actualtect=eacElement.getText();

            Assertions.assertTrue(actualtect.contains(eacElement.getText()));
        }
    }
}
