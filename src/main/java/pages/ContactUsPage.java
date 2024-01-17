package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage{

    private By firstName = By.xpath("//input[@name='first_name']");
    private By lastName = By.xpath("//input[@name='last_name']");
    private By email = By.xpath("//input[@name='email']");
    private By submitBtn =  By.className("contact_button");
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSubmitBtn(){
        click(submitBtn);
    }

    public void completeForm(String firstname, String lastname, String email){
        sendKeys(this.firstName, firstname);
        sendKeys(this.lastName, lastname);
        sendKeys(this.email, email);
    }

}
