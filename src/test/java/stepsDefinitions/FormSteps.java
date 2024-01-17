package stepsDefinitions;

import com.github.javafaker.Faker;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUsPage;
import pages.HomePage;

public class FormSteps {
    private HomePage homepage;
    private ContactUsPage contactUsPage;
    public FormSteps() {
        this.homepage = new HomePage(Hooks.getDriver());
        this.contactUsPage = new ContactUsPage(Hooks.getDriver());
    }

    @Given("^the user clicks on homepage$")
    public void the_user_clicks_on_homepage() {
        homepage.openUrl(Hooks.getProperties().getProperty("url"));
        homepage.homePageTextIsVisible();
    }

    @When("^the user clicks on Contact Us link$")
    public void the_user_clicks_on_contact_us_link() {
        homepage.openContactUs();
    }
    Faker faker = new Faker();
    @And("^the user complete the form and clicks on submit button$")
    public void the_user_complete_the_form_and_clicks_on_submit_button() {
        contactUsPage.completeForm(faker.name().firstName(), faker.name().lastName(),
                faker.internet().emailAddress());
    }

    @Then("^the form is sent$")
    public void the_form_is_sent() {
        contactUsPage.clickOnSubmitBtn();
    }
}
