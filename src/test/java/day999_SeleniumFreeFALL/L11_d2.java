package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseEach;

import java.util.List;

public class L11_d2 extends TestBaseEach {

    @Test

    public void dropdownTest(){
        //https://the-internet.herokuapp.com/dropdown sayfasinia gidiniz

        driver.get("https://the-internet.herokuapp.com/dropdown");

        //.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın

        WebElement index01= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select selectDDM=new Select(index01);
        selectDDM.selectByIndex(1);
        System.out.println(selectDDM.getFirstSelectedOption().getText());

        //Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        WebElement value2= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select selectValueDDM=new Select(value2);
        selectValueDDM.selectByValue("2");
        System.out.println(selectValueDDM.getFirstSelectedOption().getText());
//3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        selectDDM.selectByVisibleText("Option 1");
        System.out.println(selectDDM.getFirstSelectedOption().getText());

    //    4.Tüm dropdown değerleri(value) yazdırın

        List<WebElement> allList=driver.findElements(By.xpath("//select[@id='dropdown']"));
        for (WebElement eachElement : allList) {
            System.out.println(eachElement.getText());
            int listtest=4;
            Assertions.assertFalse(listtest==allList.size());

        }
    }





}
