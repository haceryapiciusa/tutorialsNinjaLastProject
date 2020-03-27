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


}
