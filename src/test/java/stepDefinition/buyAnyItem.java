package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.homePage;
import PageObjectModel.itemPage;
import PageObjectModel.searchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class buyAnyItem extends AbstractClass {
    WebDriver driver = Driver.getDriver();
    homePage homePage = new homePage();
   searchPage searchPage= new searchPage();
  itemPage itemPage= new itemPage();

    @Given("^Search for \"([^\"]*)\"$")
    public void search_for(String arg1) {
        searchPage.writeInSeachButton(arg1);
    }
    @And("^Click on search button$")
    public void click_on_search_button() {
        searchPage.clickOnButtonSearch();
        homePage.ClickOnList();
    }
    @And("^Click on any item$")
    public void click_on_any_item() {
      homePage.clickAnyProducts();

    }
    @And("^Click on proceed to checkout$")
    public void click_on_proceed_to_checkout() {

    itemPage.ClickOnProceedButton0();
    itemPage.clickOnQuantityUpButton();
    itemPage.ClickProceedButton1();
    itemPage.ClickProceedButton3();
    }
    @And("^Click on Agree the terms button$")
    public void click_on_Agree_the_terms_button(){
      itemPage.ClickOnTermsOfService();
      itemPage.ClickProceedCheckout();
    }

    @And("^Click on bank payment$")
    public void click_on_bank_payment() {
    itemPage.ClickPayByBank();
    }

    @And("^Click on confirm button$")
    public void click_on_confirm_button() {
    itemPage.ClickOnConfirmOrder();
    }

    @Then("^verify i am in the confirmation page$")
    public void verify_i_am_in_the_confirmation_page() {
    itemPage.verifyOrderConfirmed();
    }

}
