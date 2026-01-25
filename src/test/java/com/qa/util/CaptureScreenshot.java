package com.qa.util;

//CTRL+SHIFT+O to import the imports
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {

	

		/**
		 * @param driver 	
		 * @return - Capture screenshots:
		 */
		public static byte[] captureImage(WebDriver driver) {

				TakesScreenshot srcShot = (TakesScreenshot) driver;

				byte[] srcFile = srcShot.getScreenshotAs(OutputType.BYTES);

				return srcFile;

			}
}
