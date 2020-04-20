package org.automation.testingworld.datagenerator;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator 
{
	@DataProvider(name = "Static")
	public static Object[][] testDataGenerator1()
	{
		Object [][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data;
	}
	
	@DataProvider(name = "Excell")
	public static Object[][] testDataGenerator2() throws Exception
	{
		FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginsheet = workbook.getSheet("login");
		int numberOfRow = loginsheet.getPhysicalNumberOfRows();
		Object [][] testData = new Object [numberOfRow][2];
		
		for(int i = 0; i < numberOfRow;i++)
		{
			XSSFRow row = loginsheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testData[i][0] = username.getStringCellValue();
			testData[i][1] = password.getStringCellValue();
			
		}
		
		return testData;
		
	}
	
	@DataProvider(name = "Register")
	public static Object[][] testDataGenerator3() throws Exception
	{
		FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginsheet = workbook.getSheet("register");
		int numberOfRow = loginsheet.getPhysicalNumberOfRows();
		Object [][] testData = new Object [numberOfRow][3];
		
		for(int i = 0; i < numberOfRow;i++)
		{
			XSSFRow row = loginsheet.getRow(i);
			XSSFCell fname = row.getCell(0);
			XSSFCell lname = row.getCell(1);
			XSSFCell phno = row.getCell(1);
			testData[i][0] = fname.getStringCellValue();
			testData[i][1] = lname.getStringCellValue();
			testData[i][2] = phno.getStringCellValue();
			
		}
		
		return testData;
		
	}

}
