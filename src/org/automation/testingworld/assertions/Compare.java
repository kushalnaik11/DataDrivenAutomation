package org.automation.testingworld.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {
	public static boolean validatePageURL(WebDriver driver,String expURl)
	{
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURl))
		{
			flag=true;
		}
		return flag;
	}
	
	public static boolean validatePageTitle(WebDriver driver,String expTitle)
	{
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			flag=true;
		}
		return flag;
	}

}
