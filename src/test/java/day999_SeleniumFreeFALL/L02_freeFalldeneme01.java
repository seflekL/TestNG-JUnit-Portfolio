package day999_SeleniumFreeFALL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

public class L02_freeFalldeneme01 extends TestBaseEach {


    @Test
    public void test01 (){

        //1- https://testotomasyonu.com/droppable adresine gidelim

         driver.get("https://testotomasyonu.com/droppable");

         //2- Accept bolumunde “Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim

        WebElement targetButton= driver.findElement(By.id("draggable2"));
        WebElement destination01=driver.findElement(By.id("droppable2"));
        Actions actions=new Actions(driver);
        ReusableMethods.bekle(1);



        actions.dragAndDrop(targetButton,destination01).perform();
        ReusableMethods.bekle(3);
        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

        WebElement locateDropped= driver.findElement(By.xpath("//*[text()='Dropped!']"));

        String exptectedDroppedText="Dropped!";
        String actualDropTest=locateDropped.getText();

        Assertions.assertEquals(exptectedDroppedText,actualDropTest);

        //4- Sayfayi yenileyin
        driver.navigate().refresh();
        ReusableMethods.bekle(1);

        //5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim

        WebElement notacceptableButton=driver.findElement(By.xpath("//*[text()='Not Acceptable']"));
        WebElement notaccetableTarget=driver.findElement(By.id("droppable2"));

        actions.dragAndDrop(notacceptableButton,notaccetableTarget).perform();

        //6- “Drop Here” yazisinin degismedigini test edin

        String expectedTest= "Drop Here" ;
        WebElement actualtex2telement=driver.findElement(By.xpath("//*[text()='Drop Here']"));
        String     actualText=actualtex2telement.getText();

        Assertions.assertEquals(expectedTest,actualText);








    }
}
