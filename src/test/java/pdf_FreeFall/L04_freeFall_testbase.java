package pdf_FreeFall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBaseAll;

import java.util.List;

public class L04_freeFall_testbase extends TestBaseAll {

    @Test
 public void testface(){
        //a. Verilen web sayfasına gidin https://facebook.com

        driver.get("https://facebook.com");

        //Create an account buton’una basin

        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        //d. Radio button elementlerini locate edin ve size uygun olani secin

        List<WebElement>  buttonList=driver.findElements(By.className("_5k_3"));
        System.out.println(ReusableMethods.getStringList(buttonList));
        WebElement femalebox=driver.findElement(By.xpath("(//*[@class='_8esa'])[1]"));

        WebElement malebox=driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
        WebElement customBox=driver.findElement(By.xpath("(//*[@class='_8esa'])[3]"));
        malebox.click();
        ReusableMethods.bekle(5);


    //Sectiginiz radio button’un seçili, ötekilerin seçili //olmadigini test edin
        Assertions.assertTrue(malebox.isSelected());
        Assertions.assertFalse(femalebox.isSelected());
        Assertions.assertFalse(customBox.isSelected());




    }

}
