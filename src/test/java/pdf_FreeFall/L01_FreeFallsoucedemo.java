package pdf_FreeFall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class L01_FreeFallsoucedemo  extends TestBaseEach {

    @Test

    public void soucetest() {

       // 1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");

       // 2. Username kutusuna “standard_user” yazdirin
        WebElement userbox= driver.findElement(By.xpath("(//*[@class='input_error form_input'])[1]"));
        userbox.sendKeys("standard_user");
       // 3. Password kutusuna “secret_sauce” yazdirin
        WebElement passbox= driver.findElement(By.xpath("(//*[@class='input_error form_input'])[2]"));
        passbox.sendKeys("secret_sauce");
       // 4. Login tusuna basin
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
       // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[1]")).click();
       // 6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart")).click();
        ReusableMethods.bekle(5);

       // 7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_link")).click();

       // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        List<WebElement> urunCheck=driver.findElements(By.className("cart_item"));
        int checksize=1;
        Assertions.assertEquals(urunCheck.size(),checksize);
        System.out.println(urunCheck.size());
       // 9. Sayfayi kapatin

    }
}
