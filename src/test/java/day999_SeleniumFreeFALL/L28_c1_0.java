package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseEach;

public class L28_c1_0 extends TestBaseEach {

    @Test
    public void fileuploadtest01(){


       //https://the-internet.herokuapp.com/upload adresine gidelim

        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        //Yuklemek istediginiz dosyayi secelim.

       WebElement choosefileButonu= driver.findElement(By.id("file-upload"));
       String dosyaYolu=System.getProperty("user.dir")+ "/src/test/java/day09_actions/sample.png";

        choosefileButonu.sendKeys(dosyaYolu);
        String expectedYazi="File Uploaded!";
        WebElement yaziElementi=driver.findElement(By.tagName("h3"));
        String actualYazi=yaziElementi.getText();
        Assertions.assertEquals(expectedYazi,yaziElementi);


    }
}
