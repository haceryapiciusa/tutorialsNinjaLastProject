package stepDefinition;

import PageObjectModel.ChangeInfoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class changeMyPersonalInfo {
   ChangeInfoPage changeInfoPage=new ChangeInfoPage();

    @And("^Click My Personal Information$")
    public void click_My_Personal_Information() {
    changeInfoPage.clickMyPersonalInfo();
    }

    @And("^Change Date of Birth information$")
    public void change_Date_of_Birth_information() {
    changeInfoPage.chooseRandomInDropdownList();
    changeInfoPage.chooseMonthRandomInDropdownList();
    changeInfoPage.chooseYearRandomInDropdownList();
    }

    @And("^Click Current Password Box$")
    public void click_Current_Password_Box() {
     changeInfoPage.clickmyPersonalInfoCurrentPassword();
    }

    @And("^Save Button$")
    public void save_Button() {
     changeInfoPage.clickMyPersonalInfoSaveButton();
    }

    @Then("^Verify personal information upadated successfully$")
    public void verify_personal_information_upadated_successfully() {
     changeInfoPage.verifyPersonelInfoConfirmed();
    }

}
