package org.automation.testingworld.testcases;

import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerator.DataGenerator;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.Test;

public class TC_002_Register_New_User extends DriverInstance
{
	
	@Test(dataProvider="Register", dataProviderClass=DataGenerator.class)
	public void tc_002_register_new_user(String fname, String lname, String phno) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enterFirstName(fname);
		login.enterLastName(lname);
		login.enterMobileNumber(phno);
		
	}
	

}
