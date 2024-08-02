package pdf_FreeFall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseAll;

public class L02_freefallyoutube extends TestBaseAll {

    @Test
    public void youtubetestadresegit01() {

        // 1) https://www.youtube.com adresine gidin

            }
    @Test
    public void titletesti (){
        driver.get("https://www.youtube.com");

        String actualTitle=driver.getTitle();
        String expectedTitle="YouTube";
        Assertions.assertEquals(actualTitle,expectedTitle);
        System.out.println(actualTitle);
    }

    @Test
    public void imagetesti(){
        driver.get("https://www.youtube.com");
        WebElement iconTest= driver.findElement(By.xpath("(//*[@class='style-scope ytd-logo'])[1]"));
        Assertions.assertTrue(iconTest.isDisplayed());
    }
    @Test

    public void searchboxtesti(){
        WebElement  searchBox= driver.findElement(By.id("search-input"));
        Assertions.assertTrue(searchBox.isEnabled());
    }
    @Test
    public void wrongtesti(){
        driver.get("https://www.youtube.com");

        String actualTitle=driver.getTitle();
        String expectedTitle="Youtube";
        Assertions.assertNotEquals(actualTitle,expectedTitle);
        System.out.println(actualTitle);
    }

}
