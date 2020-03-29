package PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;



public class adressPage extends AbstractClass {
    WebDriver driver = Driver.getDriver();


    public adressPage(){
        PageFactory.initElements( driver , this );
    }

    @FindBy(css = "a[title='Addresses']")
    private WebElement myAdressesButton;

    @FindBy(css = "a[title='Add an address']")
    private WebElement newAdressesButton;

    @FindBy(css = "input[name='address1']")
    private WebElement adress1;
    @FindBy(css = "input[id='city']")
    private WebElement city;
    @FindBy(css = "select[id='id_state']")
    private WebElement selectstate;
    @FindBy(css = "input[id='phone']")
    private WebElement phone;
    @FindBy(css = "input[id='postcode']")
    private WebElement zipcode;
    @FindBy(css = "input[id='phone_mobile']")
    private WebElement mobilephone;
    @FindBy(css = "input[id='alias']")
    private WebElement alias;
    @FindBy(css = "button[name='submitAddress']")
    private WebElement saveadressbutton;

    @FindBy(xpath = "//h3[(text()='my second adress')]")
    private WebElement verifynewadress;

    private String expectedalias = "my second adress";

    public void clickMyAdress(){clickFunctionality(myAdressesButton); }
    public void clicknewAdress(){clickFunctionality(newAdressesButton);}
    public void enterrequiredfield()  {
        adress1.sendKeys("75 Wall Street");
        city.sendKeys("New York");
        Select state=new Select(selectstate);
        state.selectByVisibleText("New York");
        zipcode.sendKeys("10007");
      phone.sendKeys("15576489307");
       mobilephone.sendKeys("15576489304");
        alias.clear();

        alias.sendKeys(expectedalias);


   }

        public void saveAdress()  { clickFunctionality(saveadressbutton);
   }

        public void verifynewAdressAdded(){
        String actual=verifynewadress.getText();
        Assert.assertEquals(expectedalias.toUpperCase(),actual);



        }


}
