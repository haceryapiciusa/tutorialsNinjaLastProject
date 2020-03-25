package PageObjectModel;

import com.google.gson.internal.$Gson$Preconditions;
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

    public itemPage() {
        PageFactory.initElements(driver, this);
    }

    //@FindBy(css = "i[class='icon-plus']")
    @FindBy(xpath = "//i[contains(@class,'icon-plus')]")
    private WebElement quantityUpButton;

    @FindBy(xpath = "//span[contains(text(),'L')]")
    private WebElement sizeButton;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
      private WebElement proceedButton;


    public void clickOnQuantityUpButton() {

        clickFunctionality(quantityUpButton);
    }

    public void clickOnSizeButton() {
        clickFunctionality(sizeButton);
    }
    public void clickOnAddToCart(){
        clickFunctionality(addToCartButton);
    }
public void ClickOnProceedButton(){
        clickFunctionality(proceedButton);
}
    }
