package dataProvider;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class Utitlities extends base {

	public void login() {
		LandingPage landingPage = new LandingPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		ConfigFileReader configFileReader = new ConfigFileReader();
		landingPage.getSignIn().click();
		loginPage.getEmailId().sendKeys(configFileReader.getUsername());
		loginPage.getPassword().sendKeys(configFileReader.getPassword());
		loginPage.getLogIn().click();

	}
}
