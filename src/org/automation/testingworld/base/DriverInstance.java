package org.automation.testingworld.base;


import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstance {
	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Throwable
	{
		if(Utility.FetchProperty("browserName").toString().equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Utility.FetchProperty("browserName").toString().equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(Utility.FetchProperty("browserName").toString().equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get(Utility.FetchProperty("applicationURL").toString());
	}
	
	@AfterMethod
	public void closeDriverInstance() throws InterruptedException
	{
		
		driver.quit();
	}

}
