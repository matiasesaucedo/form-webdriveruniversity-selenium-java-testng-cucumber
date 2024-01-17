package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By homePagetext = By.xpath("//h1[text()=\"My Courses & Promo Codes\"]");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openUrl(String url){
        this.driver.get(url);
    }

    public boolean homePageTextIsVisible(){
        return isDisplayed(homePagetext);
    }
    public void openContactUs(){
        this.driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }
}
