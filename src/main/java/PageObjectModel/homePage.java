package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.readProperties;

import java.util.List;

public class homePage extends AbstractClass {
    WebDriver driver = Driver.getDriver();


    public homePage() {
        PageFactory.initElements(driver, this);
    }

    public void VerifyURL() {
        verifyURL("http://automationpractice.com/index.php?controller=my-account");
    }
    @FindAll({
            @FindBy(css = "a[title='Add to cart']")
    })
    private List<WebElement> addToCart;
    public void clickAnyProducts(){
        clickRandomNum(addToCart);
//p/button[@class='exclusive added'
    }

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInButton;
    @FindBy(css = "input[id='email']")
    private WebElement typeEmail;
    @FindBy(css = "input[id='passwd']")
    private WebElement typePassword;
    @FindBy(css = "p[class='submit'] button")
    private WebElement clickSubmit;

    @FindBy(css = "i[class='icon-th-list']")
    private WebElement buttonlist;

//i[class='icon-th-list']
//    @FindBy(css = "a[title='Proceed to checkout']")
//    private WebElement buttonProceedToCheckout;





    public void signIn() {
        clickFunctionality(signInButton);
        sendKeysFunctionality(typeEmail, readProperties.getData("username"));
        sendKeysFunctionality(typePassword, readProperties.getData("password"));
        clickFunctionality(clickSubmit);
    }


public void ClickOnList(){
        clickFunctionality(buttonlist);
}
}