package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;

	private By signIn = By.xpath("//a[contains(text(),'Login')]");
	private By myProfileDropdown = By.xpath("//a[@data-toggle='dropdown']");
	private By logOut = By.xpath("//li[@class='user-signout']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignIn() {

		return driver.findElement(signIn);
	}

	public WebElement getMyProfileDropdown() {

		return driver.findElement(myProfileDropdown);
	}

	public WebElement getMyLogOut() {

		return driver.findElement(logOut);
	}

}
