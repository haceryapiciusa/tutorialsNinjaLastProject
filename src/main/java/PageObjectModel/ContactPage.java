package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ContactPage extends AbstractClass {
    WebDriver driver = Driver.getDriver();
     public ContactPage(){
        PageFactory.initElements( driver , this );
        }

    public void VerifyURL(){
        verifyURL("http://automationpractice.com/index.php?controller=contact");
    }

    @FindBy(xpath = "//div[@id='contact-link']")
    private WebElement contactUS;
    public void clickContactUS(){
        clickFunctionality(contactUS);
    }


    @FindAll( {
            @FindBy(xpath = "//select[@id='id_contact']")
    } )
    private List<WebElement> dropdownList;
    public void chooseRandomInDropdownList(){
        System.out.println(dropdownList.size());
        for(int i = 0 ; i < dropdownList.size() ; i++){
            selectInTheDropdown( dropdownList.get( i ) );
        }
    }
    @FindBy(xpath = "//input[@class='form-control grey validate']")
    private WebElement Email;
    public void clickEmail(){
        clickFunctionality(Email);
    }

    @FindAll( {
            @FindBy(xpath = "//select[@name='id_order']")
} )
    private List<WebElement> orderDropdownList;
    public void chooseRandomInOrderDropdownList(){
        System.out.println(orderDropdownList.size());
        for(int i = 0 ; i < orderDropdownList.size() ; i++){
            selectInTheDropdown(orderDropdownList.get( i ) );
        }
    }

    @FindAll( {
            @FindBy(xpath = "//select[@style='display: inline-block;']")
    } )
    private List<WebElement> productDropdownList;
    public void chooseRandomInProductDropdownList(){
        System.out.println(productDropdownList.size());
        for(int i = 0 ; i < productDropdownList.size() ; i++){
            selectInTheDropdown( productDropdownList.get( i ) );
        }
    }

    @FindBy(xpath = "//span[@class='action']")
    private WebElement chooseFile;
    public void clickChooseFile() throws InterruptedException {


    }

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement inputbox;
    public void typeInTheInputs(){
            inputbox.sendKeys("Message");

    }

    @FindBy(xpath = "//button[@id='submitMessage']")
    private WebElement contactUsSubmit;
    public void clickContactUsSubmit(){
        clickFunctionality(contactUsSubmit);
    }

    @FindBy(xpath = "//div/p[contains(text(),'Your message has been successfully sent to our team.')]")
    private WebElement confirmationText;
    public void verifyContactConfirmed() {
        confirmationText.isDisplayed();
    }
}
