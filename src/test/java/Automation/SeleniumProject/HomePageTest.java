package Automation.SeleniumProject;

import org.testng.annotations.Test;

import dataProvider.Utitlities;

import pageObject.LandingPage;

public class HomePageTest extends Utitlities {

	@Test
	public void loginToRahulAcadamy() {
		LandingPage landingPage = new LandingPage(driver);
		login();
		landingPage.getMyProfileDropdown().click();
		landingPage.getMyLogOut().click();
	}

}
