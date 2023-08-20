package StepDefination;

import BaseClass.BaseClass;
import PageObject.CreateAdminUser;
import cucumber.api.DataTable;
import io.cucumber.java.en.*;

public class CreateAdminUserSteps extends BaseClass{

	CreateAdminUser createAdminUser = new CreateAdminUser();

	@And("User Enter Valid Admin Name and LastName")
	public void enterAdminNameAndLastName(DataTable adminNameData) {
		createAdminUser.enterGivenNameAndLastName(adminNameData);
	}

	@And ("User Enter valid Admin emailID and AlternateEmailID")
	public void enterAdminEmailIdAndAlternateEmailId(DataTable adminEmailData) {
		createAdminUser.enterEmailIDandAlternateEmailId(adminEmailData);
	}
	@And("User Enter Valid Admin givenName {string}")
	public void enterGivenName(String givenName) {
		createAdminUser.enterAdminGivenName(givenName);
	}
	@And("User Enter Valid Admin lastName {string}")
	public void enterLastName(String lastName) {
		createAdminUser.enterAdminLastName(lastName);
	}


	@And("User Enter Valid Admin email {string}")
	public void enterEmailID(String emailID) {
		createAdminUser.enterAdminEmailID(emailID);
	}

	@And("User Enter Valid Admin alternateEmailID {string}")
	public void enterAlternateEmailID(String alternateEmailID) {
		createAdminUser.enterAdminAlternateEmailID(alternateEmailID);
	}
	
	@Then ("click on Select Language Dropdown Box")
	public void clickOnSelectLanguageBox() {
		createAdminUser.clickOnSelectLanguageDropDownBox();
	}
	
	@And ("User Select Language {string}")
	public void selectLanguageFroomDropDownAdmin(String languages) {
		createAdminUser.selectLanguageForAdmin(languages);
	}
	
	@Then ("click on Country Code DropDown")
	public void enterCountryCode() {
		try {
		createAdminUser.clickOnCountryCodeDropDown();
	}catch (Exception e) {
		createAdminUser.clickOnCountryCodeDropDown();
	}
	}
	
	@Then ("Search the {string} and Select Country from list")
	public void searchCountryCodeAndSelectCountryFromList(String countryCode) {
		createAdminUser.searchCountryCode(countryCode);
	}


}
