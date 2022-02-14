package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle()); // sayfanin title'ini getirir Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl()); //  sayfanin adresini getirir https://www.amazon.com/

        System.out.println(driver.getWindowHandle()); // CDwindow-D25D6106E07E1351B3FD9767C1399369

        System.out.println(driver.getPageSource());
    }
}
