package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L01_deneme02 extends TestBaseEach {

    @Test
    public void test01(){

        //1."https://testotomasyonu.com/webtables" adresine gidin

        driver.get("https://testotomasyonu.com/webtables");

        // butun basliklari yazdirin

      List <WebElement> baslikElement=driver.findElements(By.xpath("//tr/th"));
  //        // baslik satirindaki 2.basligi yazdirin
       List<String>stringList=ReusableMethods.getStringList(baslikElement);

        System.out.println("Hepsi"+stringList);
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));


        // tablodaki urunlerden 2.satir, 3.sutundaki bilgiyi yazdirin

        List<WebElement> sutun2satir3=driver.findElements(By.xpath("//tr[2]/td"));
        List<String>stringList2=ReusableMethods.getStringList(sutun2satir3);
        System.out.println(stringList2.get(2));

    }
}
