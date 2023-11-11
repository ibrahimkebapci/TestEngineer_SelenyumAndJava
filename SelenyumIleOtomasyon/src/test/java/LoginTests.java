import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {

    WebDriver driver;


    // Bütün test metodlarından önce bir defa koşması için BeforeEach yazıyoruz
    @BeforeEach
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void hepsiburadaLoginTesti() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com");

        driver.findElement(By.id("myAccount")).click();
        Thread.sleep(500);
        driver.findElement(By.id("login")).click();
        Thread.sleep(500);
        driver.findElement(By.id("txtUserName")).sendKeys("seleniumOtomasyonu@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("btnLogin")).click();
    }

    @AfterEach
    void tearDown()
    {
        driver.close();
    }
}
