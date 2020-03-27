package stepDefinition;

import PageObjectModel.OrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OrderHistory {

    OrderPage orderPage=new OrderPage();
    @And("^Click view my customer account$")
    public void click_view_my_customer_account() {
    orderPage.myViewMyCustomer();
    }

    @And("^CLick order history and details$")
    public void click_order_history_and_details() {
    orderPage.myOrderHistoryAndDetails();
    }

    @Then("^Verify order history$")
    public void verify_order_history() {
    orderPage.VerifyURL();
    }
}
