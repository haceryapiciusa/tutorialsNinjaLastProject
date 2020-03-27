package PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class AbstractClass {
    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait( driver , 10 );

    public void clickFunctionality(WebElement clickButton){

        wait.until( ExpectedConditions.elementToBeClickable( clickButton ) );
        clickButton.click();

    }

    public void sendKeysFunctionality(WebElement sendKeysButton , String value){

        wait.until( ExpectedConditions.visibilityOf( sendKeysButton ) );
        sendKeysButton.sendKeys( value );
    }
    public void scrollDown() {

    }
    public int randomNum(int max){

        Random rnd = new Random(  );

        int myRandom = rnd.nextInt(max);

        return myRandom;

    }

    public void clickRandomNum(List<WebElement> listOfElements){

        int rnd = randomNum( listOfElements.size() );

        clickFunctionality( listOfElements.get( rnd ) );

    }



    public void sleep(int num){

        try {
            Thread.sleep( num * 1000 );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void selectInTheDropdown(WebElement dropdown){

        Select select = new Select( dropdown );

        List<WebElement> max = select.getOptions();

        int random = randomNum( max.size()-1 );

        select.selectByIndex( random+1 );

        sleep(1);

    }

    public void verifyURL(String expectedResult){

        sleep( 3 );
        String URL = driver.getCurrentUrl();

        Assert.assertTrue(URL.contains( expectedResult )  );

    }

    public void hoverOver(WebElement hoveroverElement){
        Actions actions = new Actions( driver );
        actions.moveToElement( hoveroverElement ).build().perform();
    }


}
