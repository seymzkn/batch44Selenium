package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //    b. Locate email textbox
        WebElement emailTextBox=driver.findElement(By.cssSelector("#session_email")); //input[@id='session_email # ve id degerini yazarsak da yeterli. class icin de basina nokta
        //    c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input[placeholder='Password']")); //input[@id='session_password
        //    d. Locate signin button
        WebElement signInButonu=driver.findElement(By.cssSelector("input[name='commit']")); // xpath //input[@name='commit']

        //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        //NOT: cssSelector kullanarak elementleri locate ediniz.

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();




    }
}
