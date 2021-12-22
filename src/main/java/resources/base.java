package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\work\\12_21_workspace\\SeleniumProject\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\work\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\work\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\work\\drivers\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			// Edge code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.close();
	}

	/*
	 * public String getScreenShotPath(String testCaseName,WebDriver driver) throws
	 * IOException { TakesScreenshot ts=(TakesScreenshot) driver; File source
	 * =ts.getScreenshotAs(OutputType.FILE); String destinationFile =
	 * System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	 * FileUtils.copyFile(source,new File(destinationFile)); return destinationFile;
	 * 
	 * 
	 * }
	 */

}
