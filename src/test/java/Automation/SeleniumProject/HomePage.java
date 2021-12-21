package Automation.SeleniumProject;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends base {

	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("https://in.yahoo.com/");
	}

}
