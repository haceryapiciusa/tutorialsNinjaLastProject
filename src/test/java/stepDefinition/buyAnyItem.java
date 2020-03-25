package stepDefinition;

import PageObjectModel.homePage;
import PageObjectModel.itemPage;
import PageObjectModel.searchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class buyAnyItem {
    WebDriver driver = Driver.getDriver();
    homePage homePage = new homePage();
   searchPage searchPage= new searchPage();
  itemPage itemPage= new itemPage();

    @Given("^Search for \"([^\"]*)\"$")
    public void search_for(String arg1) {
        homePage.writeInSeachButton(arg1);
    }
    @And("^Click on search button$")
    public void click_on_search_button() {
        homePage.clickOnButtonSearch();
    }
    @And("^Click on any item$")
    public void click_on_any_item() {

        searchPage.clickAnyProducts();
    }
    @And("^fill required fields$")
    public void fill_required_fields() {
   // itemPage.clickOnQuantityUpButton();
    itemPage.clickOnSizeButton();
    itemPage.clickOnAddToCart();
    }


    @And("^Click on proceed to checkout$")
    public void click_on_proceed_to_checkout() {
    itemPage.ClickOnProceedButton();
    itemPage.ClickOnProceedButton();
    itemPage.clickOnQuantityUpButton();

    }

    @And("^Click on Agree the terms button$")
    public void click_on_Agree_the_terms_button() {

    }

    @And("^Click on bank payment$")
    public void click_on_bank_payment() {

    }

    @And("^Click on confirm button$")
    public void click_on_confirm_button() {

    }

    @Then("^verify i am in the confirmation page$")
    public void verify_i_am_in_the_confirmation_page() {

    }

}
