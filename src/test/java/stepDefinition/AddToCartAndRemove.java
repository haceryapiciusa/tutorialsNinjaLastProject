package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.RemovePage;
import PageObjectModel.itemPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class AddToCartAndRemove extends AbstractClass {
    WebDriver driver = Driver.getDriver();
    PageObjectModel.itemPage itemPage= new itemPage();
    RemovePage removePage = new RemovePage();


    @Given("^Click on proceed checkout$")
    public void click_on_proceed_checkout() {
        itemPage.ClickOnProceedButton0();
    }

    @Given("^Click on the delete button$")
    public void click_on_the_delete_button() {
        removePage.ClickRemoveBotton();
    }

    @Then("^Verify \"([^\"]*)\"$")
    public void verify(String arg1) {
       removePage.verifyRemovedItem();
    }
}
