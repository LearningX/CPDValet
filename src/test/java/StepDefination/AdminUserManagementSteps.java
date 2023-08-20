package StepDefination;

import org.junit.Assert;

import BaseClass.BaseClass;
import PageObject.AdminUserManagementPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AdminUserManagementSteps extends BaseClass{

	AdminUserManagementPage adminUserManagement = new AdminUserManagementPage();


	@Given("User click on Admin User and Roles")
	public void userClickOnAdminUserAndRoles() {
		try {
			Thread.sleep(10000);
			adminUserManagement.clickOnAdminUserAndRoles();
		} catch (Exception e) {
			adminUserManagement.clickOnAdminUserAndRoles();
		}
	}

	@Then("Click on Admin User Management")
	public void clickOnAdminUserManagement() {
		adminUserManagement.clickOnAdminUserManagement();
	}

	@Then("Verify user is navigate to {string} page")
	public void verifyUserIsNavigatePage(String pageText) {
		boolean expectedText = driver.getPageSource().toLowerCase().contains(prop.getProperty(pageText));
		Assert.assertEquals(expectedText, true);
	}

	@Then("User click on {string} button")
	public void user_click_on_button(String string) {
		try {
			adminUserManagement.clickOnNewButtonCreateAdmin();
		}catch(Exception e) {
			adminUserManagement.clickOnNewButtonCreateAdmin();
		}
	}

}
