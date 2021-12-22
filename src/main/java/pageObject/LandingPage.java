package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;

	By signIn = By.xpath("//a[contains(text(),'Login')]");

	By emailId = By.id("email");
	
	By password= By.cssSelector("input[type=password]");
	
	By logIn = By.cssSelector("input[name='commit']");
	
	By myCoursesTab= By.partialLinkText("My Cours");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSignIn() {

		return driver.findElement(signIn);
	}

	public WebElement getEmailId() {

		return driver.findElement(emailId);
	}
	
	public WebElement getPassword() {

		return driver.findElement(password);
	}
	
	public WebElement getLogIn() {

		return driver.findElement(logIn);
	}

	public WebElement getMyCoursesTab() {

		return driver.findElement(myCoursesTab);
	}
}
