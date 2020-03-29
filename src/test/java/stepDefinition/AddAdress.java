package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.adressPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class AddAdress extends AbstractClass {
    WebDriver driver = Driver.getDriver();
    adressPage adressPage=new adressPage();



    @And("^CLick My Adresses$")
    public void click_My_Adresses() {
        adressPage.clickMyAdress();


    }

    @And("^Click a new adress$")
    public void click_a_new_adress() {
        adressPage.clicknewAdress();

    }


    @And("^Fill the required fields$")
    public void fill_the_required_fields()  {
        adressPage.enterrequiredfield();


    }

    @And("^Click Save button$")
    public void click_Save_button() {
        adressPage.saveAdress();

    }

    @Then("^Verify new adress added$")
    public void verify_new_adress_added() {
        adressPage.verifynewAdressAdded();

    }

}
