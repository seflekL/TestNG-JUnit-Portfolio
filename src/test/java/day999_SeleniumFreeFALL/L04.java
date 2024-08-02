package day999_SeleniumFreeFALL;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.TestBaseEach;

import java.io.FileInputStream;
import java.io.IOException;

public class L04 extends TestBaseEach {

    @Test

    public void test01() throws IOException {
        // 1.adim, Java ile dosyaya ulasabilmek icin dosya yolunu hazirlayalim

        String dosyaYolu = "src/test/java/day11_webTables_excelOtomasyonu/ulkeler (1).xlsx";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sayfa1 = workbook.getSheet("Sayfa1");

        Row row8 = sayfa1.getRow(7);
        Cell datasutun = row8.getCell(0);
        System.out.println(datasutun);

    }
        @Test

                public void test2 () throws IOException {

            String dosyaYolu = "src/test/java/day11_webTables_excelOtomasyonu/ulkeler (1).xlsx";

            FileInputStream fis = new FileInputStream(dosyaYolu);

            Workbook workbook = WorkbookFactory.create(fis);

            Sheet sayfa1=workbook.getSheet("Sayfa1");

            System.out.println(sayfa1.getRow(14).getCell(3));

            String expectedData="Bolivya";
            String actualData=sayfa1.getRow(21).getCell(2).toString();

            Assertions.assertEquals(expectedData,actualData);
        }


    }


