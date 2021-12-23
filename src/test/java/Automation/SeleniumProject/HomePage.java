package Automation.SeleniumProject;

import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import dataProvider.base;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class HomePage extends base {

	@Test
	public void loginToRahulAcadamy() {

		basePageNavigation();
		LandingPage landingPage = new LandingPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();
		landingPage.getSignIn().click();
		loginPage.getEmailId().sendKeys(configFileReader.getUsername());
		loginPage.getPassword().sendKeys(configFileReader.getPassword());
		loginPage.getLogIn().click();
		landingPage.getMyProfileDropdown().click();
		landingPage.getMyLogOut().click();
		closeBrowser();
	}

}
