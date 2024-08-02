package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L03 extends TestBaseEach {

    @Test
    public void test01() {
        //  1. “https://testotomasyonu.com/webtables2” sayfasina gidin

        driver.get("https://testotomasyonu.com/webtables2");

        //  2. Headers da bulunan basliklari yazdirin

        List<WebElement> baslikList = driver.findElements(By.xpath(" /html/body/div[2]/div/div/div[1]/div"));
        List<String> stringBaslikList = ReusableMethods.getStringList(baslikList);

        System.out.println(baslikList.size());
        System.out.println(stringBaslikList);

        // //  3. 3.sutunun basligini yazdirin

        List<WebElement> yeni3Element = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[4]/div"));
        List<String> yeniString3 = ReusableMethods.getStringList(yeni3Element);
        System.out.println(yeniString3);

        System.out.println(yeniString3.get(2));

        //  4. Tablodaki tum datalari yazdirin

        List<WebElement> allData =driver.findElements(By.xpath("//*[@class ='table-td']"));
        System.out.println(allData.size());

        List<String> xStringList = ReusableMethods.getStringList(allData);
        System.out.println(xStringList);
        System.out.println(xStringList.size());

        System.out.println();

        //  5. Tabloda kac tane cell (data) oldugunu yazdirin

        System.out.println(allData.size());

        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirElement=driver.findElements(By.xpath("//*[@role='trow']"));
         System.out.println(satirElement.size());

        //  7. Tablodaki sutun sayisini yazdirin

        List <WebElement> sutunSayisi= driver.findElements(By.xpath("//*[@role='hdata']"));

        System.out.println(sutunSayisi.size());

        //8. Tablodaki 3.kolonu yazdirin

        List<WebElement>ucuncuKolon=driver.findElements(By.xpath("//*[@role='tdata'][3]"));
        List<String>ucuncuKolonString=ReusableMethods.getStringList(ucuncuKolon);

        System.out.println(ucuncuKolonString);


        //  9. Tabloda " Category" si Men Fashion olan urunun fiyatini yazdirin

        System.out.println(ucuncuKolonString.get(4));


    }

}
