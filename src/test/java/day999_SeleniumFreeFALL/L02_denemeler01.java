package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L02_denemeler01 extends TestBaseEach {


    @Test
    public void test01() {


        //1."https://testotomasyonu.com/webtables" adresine gidin

        driver.get("https://testotomasyonu.com/webtables");

        //2. Web table tum body’sini yazdirin

        System.out.println("====Tum Body===");

        List<WebElement> tumbodyElement = driver.findElements(By.xpath("//tbody"));

        List<String> bodyString = ReusableMethods.getStringList(tumbodyElement);
        System.out.println(bodyString);

        //3. Web tablosunda "Comfortable Gaming Chair" bulundugunu test edin
        String exptecteditem1 = "Comfortable Gaming Chair";
        String actualist = bodyString.toString();

        Assertions.assertTrue(actualist.contains(exptecteditem1));

        //4. Web table’daki satir sayisinin 5 oldugunu test edin

        List<WebElement>testscore=driver.findElements(By.xpath("//tbody/tr"));
        List<String>testString=ReusableMethods.getStringList(testscore);
        System.out.println(testString.size());
        int testSayi=5;
        Assertions.assertEquals(testSayi,testString.size());

        //5. Tum satirlari yazdirin
        for (int i = 0; i < testscore.size(); i++) {
            System.out.println(i+1 +".satir"+testscore.get(i).getText());

        }
        //6. Web table’daki sutun sayisinin 4 olduğunu test edin
        //   Web Tablolarinda sutun bilgisi olmaz
        //   bunun yerine herhangi bir satirdaki data sayisini alabiliriz


    }
}