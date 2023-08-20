package PageObject;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;

public class LoginPage extends BaseClass{

	public By email = By.xpath("//input[@id='amplify-id-:r3:']");
	public By password = By.xpath("//input[@id='amplify-id-:r6:']");
	public By signInButton = By.xpath("//button[@type='submit']");
	public By FAToken = By.id("amplify-id-:r9:");
	public By clickContinueButton = By.xpath("//button[contains(text(),'Confirm')]");
	public void enterUserEmail() {

		waitForExpectedElement(email, 10).sendKeys(prop.getProperty("userEmail"));
	}

	public void enterPassword() {
		waitForExpectedElement(password, 10).sendKeys(prop.getProperty("Password"));
		waitForExpectedElement(password, 20);
	}
	
	public void enterTwoFactorCode() throws InterruptedException {
		
		WebElement mfaTokenElement = waitForExpectedElement(FAToken, 20);
				
		Totp totp = new Totp("ZFFKE2BOGVDKR6AZGVGMY6DBGE7RDXLC3RA46SK7NKNNOIQ4MNRQ");
		String mfaToken = totp.now();
		mfaTokenElement.sendKeys(mfaToken);

	}

	public void clickOnSignInButton() {
		waitForExpectedElement(signInButton, 10).click();
	}
	
	public void clickContiueButtonCodePage() {
		
		waitForExpectedElement(clickContinueButton, 10).click();
	}

}
