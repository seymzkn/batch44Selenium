package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

import java.time.Duration;
import java.util.List;

public class Alistirma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin

        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz
        WebElement emailTextBox=driver.findElement(By.className("form-control"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signInButonu=driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement userId=driver.findElement(By.className("navbar-text"));
        String expecteduserId="testtechproed@gmail.com";
        String actualuserId=userId.getText();

        System.out.println(expecteduserId.equals(actualuserId)? "usered Pass": "usered FAILED");




        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses= driver.findElement(By.linkText("Adresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));

        System.out.println(addresses.isDisplayed());
        System.out.println(signOut.isDisplayed());

        //3. Sayfada kac tane link oldugunu bulun

        List<WebElement> linkler=driver.findElements(By.tagName("a"));

        System.out.println(linkler.size());

        for (WebElement each : linkler
             ) {
            System.out.println(each.getText());
        }



        



    }
}
