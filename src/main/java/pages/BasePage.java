package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean isDisplayed (By locator){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return element.isDisplayed();
    }

    public void click (By locator){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        element.click();
    }
    public void sendKeys (By locator, String value){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        element.sendKeys(value);
    }

}
