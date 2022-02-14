package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    //1. Yeni bir Class olusturalim.C06_ManageWindow
    //2. Amazon soyfasina gidelim. https://www.amazon.com/
    //3. Sayfanin konumunu ve boyutlarini yazdirin
    //4. Sayfayi simge durumuna getirin
    //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
    //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
    //7. Sayfayi fullscreen yapin
    //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
    //8. Sayfayi kapatin

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Amazon soyfasina gidelim. https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin

        driver.manage().window().getPosition();
        driver.manage().window().getSize();

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize durumunda position : " + driver.manage().window().getPosition());
        System.out.println("Maximize durumunda size : " + driver.manage().window().getSize());

        //7. Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println( "Fullscreen durumunda konum :" + driver.manage().window().getPosition());
        System.out.println("Fullscreen durumunda boyut :" + driver.manage().window().getSize());
        Thread.sleep(3000);

        //8. Sayfayi kapatin
        driver.close();












    }
}
