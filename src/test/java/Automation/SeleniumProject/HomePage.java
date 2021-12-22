package Automation.SeleniumProject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import dataProvider.base;
import pageObject.LandingPage;

public class HomePage extends base {

	@Test
	public void loginToQAClickAcadamy() {

		basePageNavigation();
		LandingPage landingPage = new LandingPage(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();
		landingPage.getSignIn().click();
		landingPage.getEmailId().sendKeys(configFileReader.getUsername());
		landingPage.getPassword().sendKeys(configFileReader.getPassword());
		landingPage.getLogIn().click();
		assertTrue(landingPage.getMyCoursesTab().isDisplayed(), "My Courses should display");
		closeBrowser();
	}

}
