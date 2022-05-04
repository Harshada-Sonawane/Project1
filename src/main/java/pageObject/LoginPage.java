package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	WebDriver driver;

	private By emailId = By.id("email");
	
	private By password= By.cssSelector("input[type=password]");
	
	private By logIn = By.cssSelector("input[name='commit']");
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
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
	

}
