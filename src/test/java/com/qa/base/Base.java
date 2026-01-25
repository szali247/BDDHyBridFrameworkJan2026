package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.ReadProperties;

/**Alt + Shift + j is the shortcut to add this comment
 * 
 * This class has common methods to launch and close the browser as well as launch the application
 */
/**
 * 
 */
public class Base {
	
	public static WebDriver driver;
	
	
	
	/**
	 * @return the driver object after launching the application URL
	 */
	public WebDriver initializeWebDriver() {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ReadProperties.implicitWaitTime(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ReadProperties.getappURL());
		return driver;

	}
	
	
	/**
	 * This method is for closing the browser
	 */
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
