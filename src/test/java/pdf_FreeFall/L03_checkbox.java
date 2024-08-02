package pdf_FreeFall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseEach;

public class L03_checkbox extends TestBaseEach {

    @Test

    public void  checkbox (){

        //Verilen websayfasina gidin https://the-internet.herokuapp.com/checkboxes

        driver.get("https://the-internet.herokuapp.com/checkboxes");
// Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox01=driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
       // Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox02= driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));
//Checkbox1 seçili değilse onay kutusunu tıklayın
        checkbox01.click();
        //Checkbox1ve Checkbox2’nin seçili olduğunu test edin
        Assertions.assertTrue(checkbox01.isSelected());
        Assertions.assertTrue(checkbox02.isSelected());

     }
}
