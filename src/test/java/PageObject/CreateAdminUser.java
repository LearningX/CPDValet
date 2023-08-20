package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import cucumber.api.DataTable;

public class CreateAdminUser extends BaseClass{

	public By GIVEN_NAME_INPUTBOX = By.xpath("//input[@id='first_name']");
	public By LAST_NAME_INPUTBOX = By.xpath("//input[@id='last_name']");
	public By EMAIL_ID_INPUTBOX = By.xpath("//input[@id='email']");
	public By ALTERNATE_EMAIL_ID_INPUTBOX = By.xpath("//input[@id='alternate_email']");
	public By SELECT_LANGUAGE  = By.xpath("//span[text()='Select']");
	public By SELECT_LANAGUAGE_LIST= By.xpath("//div[@role='listbox']//mat-option");
	//	public By SELECT_LANGUAGE_VALUE = By.xpath("*[@id="mat-select-10-panel"]");
	public By COUNTRY_CODE_LIST = By.cssSelector("#ngx-mat-intl-tel-input-0 > div > button > span.mdc-button__label");
	public By SEARCH_COUNTRY_CODE = By.cssSelector("#mat-menu-panel-4 > div > input");



	public void enterGivenNameAndLastName(DataTable adminNameData) {

		List<List<String>>admin_Name = adminNameData.raw();
		waitForExpectedElement(GIVEN_NAME_INPUTBOX, 10).sendKeys(admin_Name.get(0).get(0));
		waitForExpectedElement(LAST_NAME_INPUTBOX, 10).sendKeys(admin_Name.get(0).get(1));
	}

	public void enterEmailIDandAlternateEmailId(DataTable adminEmailData) {
		List<List<String>>admin_Email = adminEmailData.raw();
		waitForExpectedElement(EMAIL_ID_INPUTBOX, 10).sendKeys(admin_Email.get(0).get(0));
		waitForExpectedElement(ALTERNATE_EMAIL_ID_INPUTBOX, 10).sendKeys(admin_Email.get(0).get(1));
	}

	public void enterAdminGivenName(String givenName) {
		waitForExpectedElement(GIVEN_NAME_INPUTBOX, 10).sendKeys(prop.getProperty(givenName));
	}
	public void enterAdminLastName(String lastName) {
		waitForExpectedElement(LAST_NAME_INPUTBOX, 10).sendKeys(prop.getProperty(lastName));
	}

	public void enterAdminEmailID(String emailID) {

		waitForExpectedElement(EMAIL_ID_INPUTBOX, 10).sendKeys(prop.getProperty(emailID));
	}
	public void enterAdminAlternateEmailID(String alternateEmailID) {

		waitForExpectedElement(ALTERNATE_EMAIL_ID_INPUTBOX, 10).sendKeys(prop.getProperty(alternateEmailID));
	}


	public void clickOnSelectLanguageDropDownBox() {


		try {
			hoverOnElement(SELECT_LANAGUAGE_LIST);
			waitForExpectedElement(SELECT_LANGUAGE,20).click();
		}catch (Exception e) {
			clickElementByJSExecutor(SELECT_LANGUAGE);
		}
	}

	public void selectLanguageForAdmin(String language) {

		//List<WebElement> languageSelect = driver.findElements(By.xpath("//div[@role='listbox']//mat-option"));
		List<WebElement> languageSelect = driver.findElements(SELECT_LANAGUAGE_LIST);
		for(WebElement selectedLanguage: languageSelect) {
			if(languageSelect.contains(prop.getProperty(language)));

			selectedLanguage.click(); 
			System.out.println(selectedLanguage);

			break;
		}
	}

	public void clickOnCountryCodeDropDown() {
		try {

			waitForExpectedElement(COUNTRY_CODE_LIST, 25).click();
		}catch (Exception e) {
			clickElementByJSExecutor(COUNTRY_CODE_LIST);
			e.printStackTrace();
		}
	
	}

	public void searchCountryCode(String countryCodes) {
		waitForExpectedElement(SEARCH_COUNTRY_CODE, 20).sendKeys(prop.getProperty(countryCodes));
	}
}
