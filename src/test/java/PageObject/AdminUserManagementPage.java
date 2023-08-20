package PageObject;

import org.openqa.selenium.By;

import BaseClass.BaseClass;

public class AdminUserManagementPage extends BaseClass{

	public By adminUserRoles = By.cssSelector("mat-list-item:nth-child(6) > span > span > div > div:nth-child(1) > h4");
	public By adminUserManagement = By.cssSelector("#mat-menu-panel-2 > div > button:nth-child(1) > span");
	public By createNewAdminButton = By.xpath("//*[@id='admin-users-create']");

	public void clickOnAdminUserAndRoles() {
		try {
			waitForExpectedElement(adminUserRoles, 60).click();
		} catch (Exception e) {
			clickElementByJSExecutor(adminUserRoles);
		}
	}

	public void clickOnAdminUserManagement() {
		waitForExpectedElement(adminUserManagement, 10).click();
	}

	public void clickOnNewButtonCreateAdmin() {
		try {
			waitForExpectedElement(createNewAdminButton,20).click();
		}
		catch (Exception e) {
			waitForExpectedElement(createNewAdminButton,20).click();
		}
	}


}
