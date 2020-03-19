package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class AbstractClass {
    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait( driver , 10 );

    public void clickFunctionality(WebElement clickButton){

        wait.until( ExpectedConditions.elementToBeClickable( clickButton ) );
        clickButton.click();

    }
}
