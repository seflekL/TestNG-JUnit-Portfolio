# 🖥️ TestNG-JUnit Portfolio Projesi
<br><br>
**TestNG-JUnit Portfolio**, Selenium WebDriver ile entegre edilmiş bir test otomasyon framework'üdür.  
Bu proje, TestNG ve JUnit kullanarak UI ve fonksiyonel testlerin kolayca yazılmasını ve çalıştırılmasını sağlar.  
Framework, test verilerinin Excel dosyalarından okunmasını ve dinamik veri üretimi için JavaFaker entegrasyonunu içerir.  
<br><br>

## ✨ Proje Özellikleri
<br><br>
- **TestNG ve JUnit Entegrasyonu**: Farklı framework'lerle testlerin bir arada kullanımı.  
- **Selenium WebDriver**: UI otomasyonu için güçlü bir araç.  
- **Dinamik Veri Üretimi**: JavaFaker kullanılarak testler için rastgele veri oluşturma.  
- **Excel Entegrasyonu**: Apache POI ile test verilerini Excel dosyalarından okuma.  
- **WebDriver Yönetimi**: WebDriverManager kullanılarak tarayıcıların otomatik yönetimi.  
<br><br>

## 📐 Kullanılan Teknolojiler ve Bağımlılıklar
<br><br>
Bu projede aşağıdaki teknolojiler kullanılmıştır:<br><br>

- **TestNG**: Test senaryolarını çalıştırma ve yönetme.  
- **JUnit**: Testlerin yürütülmesi ve raporlanması.  
- **Selenium WebDriver**: Web uygulamalarının test otomasyonu.  
- **WebDriverManager**: Tarayıcı sürücülerinin otomatik yönetimi.  
- **JavaFaker**: Rastgele veri üretimi.  
- **Apache POI**: Excel dosyalarıyla çalışma.  
- **Maven**: Proje yapılandırma ve bağımlılık yönetimi.  
<br><br>

## 🔧 Kurulum ve Çalıştırma
<br><br>
Projeyi yerel bilgisayarınıza klonlayın:  
`git clone https://github.com/seflekL/TestNG-JUnit-Portfolio.git`  
<br><br>
Proje dizinine gidin:  
`cd TestNG-JUnit-Portfolio`  
<br><br>
Maven bağımlılıklarını yükleyin:  
`mvn clean install`  
<br><br>
Testleri çalıştırın:  
`mvn test`  
<br><br>

## 📊 Örnek Test Senaryoları
<br><br>
### Parametreli Test
Aşağıdaki örnek, TestNG kullanarak farklı parametrelerle testlerin çalıştırılmasını göstermektedir:<br><br>

```java
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTest {

    @DataProvider(name = "userData")
    public Object[][] getData() {
        return new Object[][] {
            {"user1", "password1"},
            {"user2", "password2"}
        };
    }

    @Test(dataProvider = "userData")
    public void testLogin(String username, String password) {
        System.out.println("Kullanıcı: " + username + ", Şifre: " + password);
    }
}

JUnit ile Basit Test
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTest {
    @Test
    public void testAddition() {
        int result = 5 + 5;
        assertEquals(10, result, "Toplama işlemi başarısız!");
    }
}
📫 İletişim
GitHub: seflekL


