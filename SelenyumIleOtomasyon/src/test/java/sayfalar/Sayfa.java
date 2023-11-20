package sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa
{
    WebDriver driver;
    public Sayfa(WebDriver driver)
    {
        this.driver = driver;
    }
    public void elementGozukeneKadarBekle()
    {
        WebDriverwait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedCondition.presenceOfElementLocated(By.id(elementedId)));

    }
}
