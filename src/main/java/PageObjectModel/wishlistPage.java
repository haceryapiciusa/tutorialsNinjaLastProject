package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class wishlistPage extends AbstractClass {
    WebDriver driver = Driver.getDriver();
    public wishlistPage(){
        PageFactory.initElements( driver , this );
    }


    @FindBy(xpath = "//a[contains(text(),'My wishlist')]")
    private WebElement wishlistcheck;

    public void verifywishlistAdded(){ wishlistcheck.isDisplayed();}



}
