package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // biz driver objesi olusturdugumuz da bos bir chrome browser acilir

        driver.get("https://www.amazon.com");
        // driver.get methodu driver a gidecegi web adresini girmemizi saglar

        Thread.sleep(3000);

        driver.close();
        //driver'i kapatir
    }
}
