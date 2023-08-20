package StepDefination;

import BaseClass.BaseClass;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps extends BaseClass{

	LoginPage loginPage = new LoginPage();

	
	
	@Given("User Launch the site URL")
	public void userLaunchTheSiteURL() {
		launchBrowser();
	}

	@Then("User Enter Username")
	public void userEnterUsername() {
		loginPage.enterUserEmail();
	}

	@Then("User Enter Password")
	public void userEnterPassword() {
		loginPage.enterPassword();
	}
	
	@Then ("Enter Two MFA Code")
	public void enterTwoMFACode() throws InterruptedException {
		loginPage.enterTwoFactorCode();
		
		loginPage.clickContiueButtonCodePage();
	}

	@Then("User click on signIn button")
	public void clickOnSignInButton() {
		loginPage.clickOnSignInButton();
		
	}
}
