package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L01_deneme01 extends TestBaseEach {

    @Test
    public void test01(){

     //1."https://testotomasyonu.com/webtables" adresine gidin

        driver.get("https://testotomasyonu.com/webtables");


        // butun basliklari yazdirin

        WebElement  tumTitle= driver.findElement(By.xpath("//tr"));

        String tumtitleS=tumTitle.getText();

        System.out.println(tumtitleS);

        // baslik satirindaki 2.basligi yazdirin

        WebElement ikinciBaslik=driver.findElement(By.xpath("//tr/th[2]"));

        System.out.println(ikinciBaslik.getText());

        // tum basliklari bir liste olarak kaydedin

        List<WebElement>baslikelement=driver.findElements(By.xpath("//tr"));
        int flag=0;
        // [Produt Name, Category, Price, Actions]
        // 4.basligi yazdirin
        List <String> basliklarList= ReusableMethods.getStringList(baslikelement);
        System.out.println(basliklarList);
        System.out.println("=======");
        System.out.println(basliklarList.get(3));

        // tablodaki urunlerden 2.satir, 3.sutundaki bilgiyi yazdirin
        WebElement listdenemeler= driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
        System.out.println(listdenemeler.getText());

        // 3.satirdaki urunun butun bilgilerini yazdirin

        System.out.println(driver.findElement(By.xpath("//tbody/tr[3]")).getText());


    }
     }

