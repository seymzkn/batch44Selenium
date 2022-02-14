package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // ...Exercise3...
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//a[@class='cookie-choices-button'][2]")).click();


        //fill the firstname
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Seyma");

        //fill the firstname
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("ozkan");
        lastName.sendKeys(Keys.PAGE_DOWN);
        //check the gender
        driver.findElement(By.id("sex-1")).click();
        //check the experience
        driver.findElement(By.id("exp-1")).click();

        //fill the date
        WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("24.01.2022");

        //choose your profession -> Automation Tester
        WebElement prf=driver.findElement(By.xpath("//input[@id='profession-1']"));
        prf.click();
        prf.sendKeys(Keys.PAGE_DOWN);


        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        //choose your continent -> Antartica
        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");

        //choose your command  -> Browser Commands
        //click submit button
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();

        }
}
