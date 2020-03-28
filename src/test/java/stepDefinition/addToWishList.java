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
     itemPage itemPage= new itemPage();
    OrderPage orderPage=new OrderPage();
    wishlistPage wishlistPage=new wishlistPage();



// sgghhjjk gdhsksfldsfsyughhjk ert




    @And("^Change the gridview to list$")
    public void change_the_gridwiev_to_list() {
        itemPage.listViewMode();

    }

    @And("^Select any of the item$")
    public void select_on_of_the_item() {
        itemPage.selectanyitem();

    }

    @And("^Switch to the frame$")
    public void switch_to_the_frame() {
        itemPage.switchtoframe();

    }




    @And("^Click on the add to wish list$")
    public void click_on_the_add_to_wish_list() {
        itemPage.addWishList();

    }

    @And("^Click added to wish list pop-up to close$")
    public void click_added_to_wish_list_pop_up_to_close() {
        itemPage.closePopUP();

    }

    @And("^Click button to close frame$")
    public void click_button_to_close_frame() {
        itemPage.closeFrame();
       // itemPage.returnmainpage();

    }

    @And("^Click the view my customer account$")
    public void click_the_view_my_customer_account() {
        itemPage.setMycustomeraccount();

    }

    @And("^Click on my wishlist$")
    public void click_on_my_wishlist() {
        orderPage.mywishlist();


    }



    @Then("^Verify the wishlist$")
    public void verify_the_wishlist() {
        wishlistPage.verifywishlistAdded();


    }









}
