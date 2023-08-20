package BaseClass;

import java.io.IOException;
import java.util.logging.Level;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {

	@Before
	public void setup() {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			ChromeOptions options = getChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("headless");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}


	private static ChromeOptions getChromeOptions() {
		LoggingPreferences logs = new LoggingPreferences();
		logs.enable(LogType.DRIVER, Level.OFF);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-web-security");
		chromeOptions.addArguments("--test-type");
		chromeOptions.addArguments("allow-running-insecure-content");
		return chromeOptions;
	}

	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				takeScreenSort();
			} catch (IOException e) {

				e.printStackTrace();
			} finally {

			}
		//	driver.quit();
		}
	}
}
