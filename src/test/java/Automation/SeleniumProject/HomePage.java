package Automation.SeleniumProject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class HomePage extends base {
	

	@Test
	public void loginToQAClickAcadamy() throws IOException {

		basePageNavigation();
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getSignIn().click();
		assertTrue(landingPage.getEmailId().isDisplayed(), "Email id should display");
		closeBrowser();

	}

}
