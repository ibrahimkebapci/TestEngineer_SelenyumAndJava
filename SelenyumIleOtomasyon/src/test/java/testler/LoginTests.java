package testler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import sayfalar.AnaSayfa;
import sayfalar.GirisYapSayfasi;

import java.time.Duration;

public class LoginTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;

    // Bütün test metodlarından önce bir defa koşması için BeforeEach yazıyoruz
    @BeforeEach
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
    }

    @Test
    void hepsiburadaLoginTesti() throws InterruptedException
    {
        driver.get("https://www.hepsiburada.com");

        anaSayfa.elementGozukeneKadarBekle(anaSayfa.hesabim);


        //!!! Hata
        WebDriverwait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));


        driver.findElement(By.id("myAccount")).click();

        anaSayfa.elementGozukeneKadarBekle(anaSayfa.girisYap);

        wait.until(ExpectedCondition.presenceOfElement.Located(By.id("login")));

        driver.findElement(By.id("login")).click();

        wait.until(ExpectedCondition.presenceOfElement.Located(By.id("txtUserName")));

        driver.findElement(By.id("txtUserName")).sendKeys("seleniumOtomasyonu@gmail.com");

        wait.until(ExpectedCondition.presenceOfElement.Located(By.id("btnLogin")));

        driver.findElement(By.id("btnLogin")).click();
    }


    @AfterEach
    void tearDown()
    {
        driver.close();
    }
}
