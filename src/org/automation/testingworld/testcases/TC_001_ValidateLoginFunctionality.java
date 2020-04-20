package org.automation.testingworld.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerator.DataGenerator;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance
{
	
//	@Test
//	public void tc_001_login_functionality() throws Exception
//	{
//		LoginPage login = new LoginPage(driver);
//		login.enterUsername("User1");
//		login.enterPassword("pass1");
//		login.clickSignin();
//		Thread.sleep(3000);
//	}
	
	@Test(dataProvider = "Excell", dataProviderClass=DataGenerator.class)
	public void tc_002_login_functionality(String uname, String pass) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
	}
	
//	@DataProvider(name = "Static")
//	public Object[][] testDataGenerator1()
//	{
//		Object [][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
//		return data;
//	}
//	
//	@DataProvider(name = "Excell")
//	public Object[][] testDataGenerator2() throws Exception
//	{
//		FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet loginsheet = workbook.getSheet("login");
//		int numberOfRow = loginsheet.getPhysicalNumberOfRows();
//		Object [][] testData = new Object [numberOfRow][2];
//		
//		for(int i = 0; i < numberOfRow;i++)
//		{
//			XSSFRow row = loginsheet.getRow(i);
//			XSSFCell username = row.getCell(0);
//			XSSFCell password = row.getCell(1);
//			testData[i][0] = username.getStringCellValue();
//			testData[i][1] = password.getStringCellValue();
//			
//		}
//		
//		return testData;
//		
//	}
	

}
