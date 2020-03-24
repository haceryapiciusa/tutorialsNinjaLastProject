package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.readProperties;

public class addToCartAndRemove {
//         //input[@name='search']    search              home page
//        div[id='search'] button                       homepage
//          //button[contains(@onclick,'cart.add')]       add to cart     search page
//       //a[(text()='shopping cart')]      go to shopping cart   search page
//    //button[@data-original-title='Remove']    removing from cart    cart page
//    //*[@id='content']//*[text()='Your shopping cart is empty!']      verify  cart page



    WebDriver driver= Driver.getDriver();


    @Given("^Go to the url$")
    public void go_to_the_url() {
        driver.get( readProperties.getData( "URL" ) );
        driver.manage().window().maximize();


    }


    @And("^Search the iphone$")
    public void search_the_iphone() {

    }

    @And("^Click the add to cart button$")
    public void click_the_add_to_cart_button() {

    }

    @And("^Go to the shopping cart$")
    public void go_to_the_shopping_cart() {

    }

    @And("^Delete the item$")
    public void delete_the_item() {

    }

    @Then("^Verify Your shopping cart is empty!$")
    public void verify_Your_shopping_cart_is_empty() {

    }




}


