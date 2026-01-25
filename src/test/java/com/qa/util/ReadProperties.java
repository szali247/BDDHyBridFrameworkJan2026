package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Alt + Shift + j is the shortcut to add this comment
 * This class has methods to read the properties from config.properties file 
 */
public class ReadProperties {

	public static Properties loadProperties() {
	// Open the File
			File objfile = new File("AppConfig/config.properties");
			// Read the File

			FileInputStream objfis = null;
			try {
				objfis = new FileInputStream(objfile);
			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}

			Properties objprop = new Properties();
			try {
				objprop.load(objfis);
			} catch (IOException e) {

				e.printStackTrace();
			}
			return objprop;

		}


/**
 * @return this method will read app url from config file and return app url
 */
public static String getappURL() {

	return loadProperties().getProperty("appURL");

	}

/**
 * @return: It returns implicit wait in string format but we need to convert it into long format using parselong now it returns long format
 */
public static long implicitWaitTime() {

	return Long.parseLong(loadProperties().getProperty("implicitWaitTime"));
}


/**
 * @return: it will read username from properties file and returns the username value
 */
public static String getAppUserName() {
	return loadProperties().getProperty("userName");
}


/**
 * @return: it will read password from properties file and returns the password value
 */
public static String getAppPassword() {
	return loadProperties().getProperty("password");
}


/**
 * @return: It will retufn fluentWaitTime in the String format and it will convert it into long format and return it
 */
public static long getFluentWaitTime() {

	return Long.parseLong(loadProperties().getProperty("fluentWaitTime"));
}


}