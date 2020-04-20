package org.automation.testingworld.pages;


import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void enterUsername(String uname) throws Exception
	{
		driver.findElement(By.id(Utility.FetchLocatorValue("login_username_id"))).sendKeys(uname);
	}
	public void enterPassword(String pass) throws Exception
	{
		driver.findElement(By.id(Utility.FetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
	
	public void enterFirstName(String firstName) throws Exception
	{
		driver.findElement(By.name(Utility.FetchLocatorValue("login_firstname_name"))).sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) throws Exception
	{
		driver.findElement(By.name(Utility.FetchLocatorValue("login_lastname_name"))).sendKeys(lastName);
	}
	
	public void enterMobileNumber(String mobNumber) throws Exception
	{
		driver.findElement(By.xpath(Utility.FetchLocatorValue("login_mobilnumber_xpath"))).sendKeys(mobNumber);
	}
	public void clickSignin() throws Exception
	{
		driver.findElement(By.xpath(Utility.FetchLocatorValue("login_signin_xpath"))).click();
	}

}
