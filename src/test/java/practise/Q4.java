package practise;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Q4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // ...Exercise5...
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //    Type any number in the first input
        WebElement firstInput=driver.findElement(By.id("number1"));
        firstInput.sendKeys("56");
        //    Type any number in the second input
        WebElement secondInput=driver.findElement(By.id("number2"));
        secondInput.sendKeys("96");
        // Click on Calculate
        driver.findElement(By.id("calculate")).click();

        // Get the result
        String result=driver.findElement(By.xpath("//span[@id='answer']")).getText();


        // Print the result
        System.out.println("result : " + result);




    }
}
