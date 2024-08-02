package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L13 extends TestBaseEach {

    @Test

   public void dropdown(){

       driver.get("https://testotomasyonu.com/form");
       //1. Dogum tarihi gun seçeneğinden index kullanarak 5’i secin

       WebElement gunbox= driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
       Select selectgunDDM=new Select(gunbox);
        selectgunDDM.selectByIndex(5);
         //2. Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin

        WebElement dogumayDDm= driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
        Select ayDDM=new Select(dogumayDDm);
        ayDDM.selectByValue("nisan");

        //3. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin.

        WebElement yil= driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
        Select selectyilddm=new Select(yil);
        selectyilddm.selectByVisibleText("1990");

        //4. Secilen değerleri konsolda yazdirin

        System.out.println(selectgunDDM.getFirstSelectedOption().getText());
        System.out.println(ayDDM.getFirstSelectedOption().getText());
        System.out.println(selectyilddm.getFirstSelectedOption().getText());

        //5. Ay dropdown menüdeki tum değerleri(value) yazdırın

        List<WebElement> ayList=ayDDM.getOptions();

        System.out.println(ReusableMethods.getStringList(ayList));


        //6. Ay Dropdown menusunun boyutunun 13 olduğunu test edin

        System.out.println(ayDDM.getOptions().size());

        Assertions.assertTrue(ayDDM.getOptions().size()==13);

        int exptexdexSize=13;
        int acutalList=ayDDM.getOptions().size();

         Assertions.assertEquals(exptexdexSize,acutalList);

    }
    }
