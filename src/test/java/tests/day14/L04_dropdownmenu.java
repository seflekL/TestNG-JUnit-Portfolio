package tests.day14;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.ToFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class L04_dropdownmenu {
    @Test

    public void dropdown (){
        ToFormPage toFormPage=new ToFormPage();

        Driver.getDriver().get(ConfigReader.getProperty("tourlform"));

        //2- Dogum tarihi gun seçeneğinden index kullanarak 5’i secin

        Select selectGun =new Select(toFormPage.gunDropdownElementi);
        selectGun.selectByIndex(5);

        //3- Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin

        Select selectAy=new Select(toFormPage.ayDropdownElementi);
        selectAy.selectByValue("nisan");
        //4- Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin

        Select selectYil=new Select(toFormPage.yilDropdownElementi);
        selectYil.selectByVisibleText("1990");

        //5- Secilen değerleri konsolda yazdirin
        System.out.println(selectGun.getFirstSelectedOption().getText());
        System.out.println(selectAy.getFirstSelectedOption().getText());
        System.out.println(selectYil.getFirstSelectedOption().getText());

        //6- Ay dropdown menüdeki tum değerleri(value) yazdırın

        System.out.println(selectAy.getOptions().size());
        System.out.println(ReusableMethods.getStringList(selectAy.getOptions()));


         Driver.driver.quit();
   }
}
