package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderPage extends AbstractClass {
    WebDriver driver = Driver.getDriver();
    public OrderPage(){
        PageFactory.initElements( driver , this );
    }

    public void VerifyURL(){
        verifyURL("http://automationpractice.com/index.php?controller=history");
    }

    @FindBy(xpath = "//div[@class='header_user_info']")
    private WebElement viewMyCustomer;
    public void myViewMyCustomer(){
        clickFunctionality(viewMyCustomer);
    }

    @FindBy(xpath = "//span[contains(text(),'Order history and details')]")
    private WebElement OrderHistoryAndDetails;
    public void myOrderHistoryAndDetails(){
        clickFunctionality(OrderHistoryAndDetails);
    }

    @FindBy(xpath = "//span[contains(text(),'My wishlists')]")
    private WebElement mywishlist;
    public void mywishlist(){
        clickFunctionality(mywishlist);
    }

}
