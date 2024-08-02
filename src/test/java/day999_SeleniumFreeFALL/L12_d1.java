package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L12_d1 extends TestBaseEach {


    @Test

    public void testDDM(){

        driver.get("https://testotomasyonu.com/form");

        //1. Dogum tarihi gun seçeneğinden index kullanarak 5’i secin

        WebElement gunbox= driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        Select selectgunDMM=new Select(gunbox);
        selectgunDMM.selectByIndex(5);

        //2. Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin

        WebElement aybox= driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
        Select selectayDDM=new Select(aybox);
        selectayDDM.selectByValue("nisan");

        //3. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin.

        WebElement yilbox= driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
        Select selectyilDDM=new Select (yilbox);
        selectyilDDM.selectByVisibleText("1990");

        //4. Secilen değerleri konsolda yazdirin
        System.out.println(selectgunDMM.getFirstSelectedOption().getText());
        System.out.println(selectayDDM.getFirstSelectedOption().getText());
        System.out.println(selectyilDDM.getFirstSelectedOption().getText());

        //5. Ay dropdown menüdeki tum değerleri(value) yazdırın

        List<WebElement> ayListElement=selectayDDM.getOptions();

        System.out.println(ReusableMethods.getStringList(ayListElement));

        //6. Ay Dropdown menusunun boyutunun 13 olduğunu test edin

        int testnumber=13;
        int aySize=selectayDDM.getOptions().size();


        Assertions.assertEquals(testnumber,aySize);






    }


}
