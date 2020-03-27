package stepDefinition;

import PageObjectModel.ContactPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class contactUs {
    ContactPage contactPage=new ContactPage();

    @And("^Click contact us$")
    public void click_contact_us() {
        contactPage.clickContactUS();
    }

    @And("^Select heading$")
    public void select_heading() {
        contactPage.chooseRandomInDropdownList();

    }

    @And("^Email address$")
    public void email_address() {
        contactPage.clickEmail();
    }

    @And("^Select Order reference$")
    public void select_Order_reference() {
        contactPage.chooseRandomInOrderDropdownList();
    }

    @And("^Select Product$")
    public void select_Product() {

    }

    @And("^Type message$")
    public void type_message() {

    }

    @And("^Click send button$")
    public void click_send_button() {

    }

    @Then("^Verify contact us page$")
    public void verify_contact_us_page() {

    }

}
