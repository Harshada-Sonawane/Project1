package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	public WebDriver initializeDriver() {

		if (configFileReader.getBrowser().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
			driver = new ChromeDriver();

		} else if (configFileReader.getBrowser().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
			driver = new FirefoxDriver();

		} else if (configFileReader.getBrowser().equals("edge")) {
			System.setProperty("webdriver.edge.driver", configFileReader.getDriverPath());
			driver = new EdgeDriver();

		}

		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;

	}

	public void basePageNavigation() {
		driver = initializeDriver();
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.close();
	}

}
