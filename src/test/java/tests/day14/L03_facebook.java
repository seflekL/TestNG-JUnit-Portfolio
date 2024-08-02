package tests.day14;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class L03_facebook {

    @Test

    public void facebook(){
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("faceurl"));

        //3- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //email ve sifre degerlerini yazdirip, giris butonuna basin
        facebookPage.emailBox.sendKeys(faker.funnyName().name());
        facebookPage.passBox.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();

        //5- Basarili giris yapilamadigini test edin

        // giris yapamadigimizi, hala email kutusunun gorundugu ile test edebiliriz

        Assert.assertTrue(facebookPage.emailBox.isDisplayed());

        ReusableMethods.bekle(5);

        Driver.driver.quit();


    }
}
