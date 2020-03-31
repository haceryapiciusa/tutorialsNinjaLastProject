package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RemovePage extends AbstractClass {
    WebDriver driver = Driver.getDriver();

    public RemovePage(){
        PageFactory.initElements( driver , this );
    }

    @FindBy (xpath = "//i[@class='icon-trash']")
    private WebElement removebutton;
    public void ClickRemoveBotton(){
        clickFunctionality(removebutton);
    }

    @FindBy(xpath = "//div/p[contains(text(),'Your shopping cart is empty.')]")
    private WebElement removedItem;
    public void verifyRemovedItem() {
        removedItem.isDisplayed();
    }

}
