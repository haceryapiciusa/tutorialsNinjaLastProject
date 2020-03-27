package PageObjectModel;

import com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class itemPage extends AbstractClass {
    WebDriver driver = Driver.getDriver();
    homePage homePage= new homePage();
    JavascriptExecutor js = (JavascriptExecutor) driver;



    public itemPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a/span[contains(text(),'Proceed to checkout')]")
    private WebElement proceedButton0;
    @FindBy(xpath = "//i[contains(@class,'icon-plus')]")
    private WebElement quantityUpButton;
    @FindBy(xpath = "//p/a/span[contains(text(),'Proceed to checkout')]")
    private WebElement proceedButton1;
    @FindBy(css = "button[name='processAddress']")
    private WebElement proceedButton3;
    @FindBy(css = "div[id='uniform-cgv']")
    private WebElement termsOfService;
    @FindBy(xpath = "//button/span[contains(text(),'Proceed to checkout')]")
    private WebElement proceedCheckOut;
    @FindBy(xpath = "//div[@class='col-xs-12 col-md-6']")
    private WebElement bankPay;
    @FindBy(css = "button[class='button btn btn-default button-medium']")
    private WebElement confirmOrder;
    @FindBy(xpath = "//p/strong[contains(text(),'Your order on My Store is complete.')]")
    private WebElement confirmationText;

    @FindBy(css="i[class='icon-th-list']")
    private WebElement listview;

    @FindAll({
            @FindBy(css = "div[class='product-image-container']")
    })
    private List<WebElement> products;

    @FindBy(xpath="//a[@id='wishlist_button']")
    private WebElement addwishlist;

    @FindBy(css="a[title='Close']")
    private WebElement closepopup;

    @FindBy(css="a[title='View my customer account']")
    private WebElement mycustomeraccount;

    @FindBy(className="fancybox-item ")
    private WebElement closingframebutton;


//div[@id='uniform-cgv']

    public void ClickOnProceedButton0(){

        clickFunctionality(proceedButton0);
    }
    public void clickOnQuantityUpButton() {
        clickFunctionality(quantityUpButton);
    }
    public void ClickProceedButton1() {

        clickFunctionality(proceedButton1);
    }
    public void ClickProceedButton3(){
        clickFunctionality(proceedButton3);
    }

    public void ClickOnTermsOfService() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickFunctionality(termsOfService);
    }
    public void ClickProceedCheckout(){
        clickFunctionality(proceedCheckOut);
    }
    public void ClickPayByBank(){
        clickFunctionality(bankPay);
    }
    public void ClickOnConfirmOrder(){
        clickFunctionality(confirmOrder);
    }
    public void verifyOrderConfirmed(){
        confirmationText.isDisplayed();

    }
    public void listViewMode(){
        clickFunctionality(listview);
    }
    public void selectanyitem(){
        clickRandomNum(products);
    }
    public void addWishList(){ clickFunctionality(addwishlist); }
    public void closePopUP(){
        clickFunctionality(closepopup);
    }
    public void setMycustomeraccount(){clickFunctionality(mycustomeraccount); }
    public void switchtoframe(){
        driver.switchTo().frame(0);
    }
    public void closeFrame(){ clickFunctionality(closingframebutton); }
   // public void returnmainpage(){ driver.switchTo().parentFrame(); }


    }

