package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.homePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.readProperties;

import java.util.Properties;

public class signIn {
    WebDriver driver = Driver.getDriver();
    homePage homePage = new homePage();


    @Given("^Navigate to website$")
    public void navigate_to_website() {
        driver.get(readProperties.getData("URL"));
        driver.manage().window().maximize();
    }

    @Given("^Click on the sign in buttton$")
    public void click_on_the_sign_in_buttton() {
        homePage.signIn();

    }

    @Then("^Verify you logged in$")
    public void verify_you_logged_in() {

        homePage.VerifyURL();
    }


}
