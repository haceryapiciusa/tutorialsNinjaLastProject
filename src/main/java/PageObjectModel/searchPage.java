package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class searchPage extends AbstractClass {
    WebDriver driver= Driver.getDriver();
    public  searchPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "input[id='search_query_top']")
    private WebElement searchInput;
    @FindBy(css = "button[name='submit_search']")
    private WebElement buttonSearch;



    public void writeInSeachButton(String search) {
        sendKeysFunctionality(searchInput, search);
    }

    public void clickOnButtonSearch() {
        clickFunctionality(buttonSearch);
    }

}
