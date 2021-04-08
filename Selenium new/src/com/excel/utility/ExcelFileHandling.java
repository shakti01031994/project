package com.excel.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//ApachePOI library
public class ExcelFileHandling
{
	@Test

	public void fetchdata() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakti Ray\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		FileInputStream fis=new FileInputStream("E:\\Selenium\\Selenium new\\src\\com\\excelfile\\regd.xlsx");
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	Sheet s=wb.getSheet("shakti.data");
	int rowCount=s.getLastRowNum();
	
	for(int rowNUm=1;rowNUm<=rowCount;rowNUm++)
	{
	System.out.println("======");
	Cell firstname=s.getRow(rowNUm).getCell(0);
	System.out.println(firstname);
	
	Cell lastname=s.getRow(rowNUm).getCell(1);
	System.out.println(lastname);
	
	Cell username=s.getRow(rowNUm).getCell(2);
	System.out.println(username);
	
	Cell password=s.getRow(rowNUm).getCell(3);
	System.out.println(password);
	
	Cell email=s.getRow(rowNUm).getCell(4);
	System.out.println(email);
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakti Ray\\Downloads\\chromedriver.exe");
	driver.get("https://www.ebay.com/");
	driver.findElement(By.linkText("register")).click();
	driver.findElement(By.id("firstname")).sendKeys(firstname.toString());
	driver.findElement(By.id("lastname")).sendKeys(lastname.toString());
	driver.findElement(By.id("Email")).sendKeys(email.toString());
	driver.findElement(By.id("password")).sendKeys(email.toString());
	}
	//driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
	driver.close();
	
}
}


	
