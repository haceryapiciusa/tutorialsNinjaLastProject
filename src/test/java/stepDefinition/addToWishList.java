package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.OrderPage;
import PageObjectModel.itemPage;
import PageObjectModel.wishlistPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class addToWishList extends AbstractClass {
    WebDriver driver = Driver.getDriver();
    itemPage itemPage = new itemPage();
    OrderPage orderPage = new OrderPage();
    wishlistPage wishlistPage = new wishlistPage();


// add comment

    @And("^Change the gridview to list$")
    public void change_the_gridwiev_to_list() {
        itemPage.listViewMode();

    }
    @And("^Select any item's addtowish$")
    public void select_any_item_s_addtowish() {
        itemPage.selectanyitemswishlist();

    }
    @And("^Click added to wish list pop-up to close$")
    public void click_added_to_wish_list_pop_up_to_close() {
        itemPage.closePopUP();

    }

    @And("^Click the view my customer account$")
    public void click_the_view_my_customer_account() {
     itemPage.setMycustomeraccount();
    }

    @And("^Click on my wishlist$")
    public void click_on_my_wishlist() {
        itemPage.setClickwishlist();


    }
    @Then("^Verify My wishlist displayed$")
    public void verify_My_wishlist_displayed() {
       wishlistPage.verifywishlistAdded();
    }



}