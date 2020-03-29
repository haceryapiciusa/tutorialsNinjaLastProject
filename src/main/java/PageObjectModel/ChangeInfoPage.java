package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.readProperties;

import java.util.List;

public class ChangeInfoPage extends AbstractClass{
    WebDriver driver = Driver.getDriver();
    public ChangeInfoPage(){
        PageFactory.initElements( driver , this );
    }

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    private WebElement myPersonalInfo;
    public void clickMyPersonalInfo(){
        clickFunctionality(myPersonalInfo);
    }

    @FindAll( {
            @FindBy(xpath = "//select[@id='days']")
    } )
    private List<WebElement> dayDropdownList;
    public void chooseRandomInDropdownList(){
        System.out.println(dayDropdownList.size());
        for(int i = 0 ; i < dayDropdownList.size() ; i++){
            selectInTheDropdown( dayDropdownList.get( i ) );
        }
    }

    @FindAll( {
            @FindBy(xpath = "//select[@id='months']")
    } )
    private List<WebElement> monthDropdownList;
    public void chooseMonthRandomInDropdownList(){
        System.out.println(monthDropdownList.size());
        for(int i = 0 ; i < monthDropdownList.size() ; i++){
            selectInTheDropdown( monthDropdownList.get( i ) );
        }
    }

    @FindAll( {
            @FindBy(xpath = "//select[@id='years']")
    } )
    private List<WebElement> yearDropdownList;
    public void chooseYearRandomInDropdownList(){
        System.out.println(yearDropdownList.size());
        for(int i = 0 ; i < yearDropdownList.size() ; i++){
            selectInTheDropdown( yearDropdownList.get( i ) );
        }
    }

    @FindBy(xpath = "//input[@data-validate='isPasswd']")
    private WebElement myPersonalInfoCurrentPassword;
    public void clickmyPersonalInfoCurrentPassword(){
        sendKeysFunctionality(myPersonalInfoCurrentPassword, readProperties.getData("password"));

    }

    @FindBy(xpath = "//button[@name='submitIdentity']")
    private WebElement myPersonalInfoSaveButton;
    public void clickMyPersonalInfoSaveButton(){
        clickFunctionality(myPersonalInfoSaveButton);
    }

    @FindBy(xpath = "//div/p[contains(text(),'Your personal information has been successfully updated.')]")
    private WebElement confirmationText;
    public void verifyPersonelInfoConfirmed() {
        confirmationText.isDisplayed();
    }


}
