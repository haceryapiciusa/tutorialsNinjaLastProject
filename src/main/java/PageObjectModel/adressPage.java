package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adressPage {
    WebDriver driver = Driver.getDriver();
    public adressPage(){
        PageFactory.initElements( driver , this );
    }
}
