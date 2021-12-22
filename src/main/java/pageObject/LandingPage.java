package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;

	By signIn = By.xpath("//span[contains(text(),'Login')]");

	By emailId = By.xpath("//input[@id='user_email']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignIn() {

		return driver.findElement(signIn);
	}

	public WebElement getEmailId() {

		return driver.findElement(emailId);
	}

}
