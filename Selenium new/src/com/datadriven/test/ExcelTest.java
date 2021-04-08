package com.datadriven.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.excel.utility.ExcelFileHandling;

public class ExcelTest extends ExcelFileHandling {
	@Test
	public static void main(String[] args) throws  IOException
	{
		
		
		
		
		
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakti Ray\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.findElement(By.linkText("register")).click();

		
		
	
		
		



	
	}
}
