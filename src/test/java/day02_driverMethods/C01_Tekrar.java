package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // Normalde selenium'un kendi IDE'si de var fakat biz daha kullanisli oldugu icin intellliJ kullaniyoruz
    // intelliJ'de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz gerekir
    // biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
    // bu ekledigimiz dosyalarla artik driver'in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        // setProperty methodu 2 parametre ister
        // ilki kullanacagimiz browser'a ait driver
        // ikinci parametre ise selenium sitesinden indirip projemize ekledigimiz chrome driver'in path'i
        // windows kullanicilari sona .exe eklerken, apple kullananlar .exe eklememeli

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        // java'dan gelir, icine yazilan milisaniye kadar kodlarin calismasini durdurur

        driver.close();
        // driver.close class in sonuna yazilir. Cunku bu kod calisinca driverimiz kapanir
        // bu kod'dan sonra yeniden bir browser amcak istiyorsak driver a yeni deger atamaliyiz

    }
}
