package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	/*
	 * 
	 enter system property for chrome
	 login method
	 open chrome browser
	 enter url
	 google title
	 log out from app
	 close the browser
	 delete all cookies
	 PASSED: googleTitle
	 /*/
	
	//pre-conditions annotations-starting with @Before
	@BeforeSuite//1
	public void setup()
	{
		System.out.println("enter system property for chrome");
	}
	
	@BeforeTest//2
	public void login()
	{
		System.out.println("login method");
	}
	
	
	@BeforeClass//3
	public void launchbrowser()
	{
		System.out.println("open chrome browser");
	}
	
	
	@BeforeMethod//4
	public void enterURL()
	{
		System.out.println("enter url");
	}
	

	
	//test cases starting with @Test
	@Test//5
	public void googleTitle()
	{
		System.out.println("google title");
	}
	
	@Test
	public void search()
	{
		System.out.println("google search");
	}
//post-condition annotations starting with @After
	
	@AfterMethod//6
	public void logOut()
	{
		System.out.println("log out from app");
	}
	
	@AfterClass
	public void close()//7
	{
		System.out.println("close the browser");
	}
	
	@AfterTest//8
	public void deleteallCookies()
	{
		System.out.println("delete all cookies");
	}
	
	/*@AfterSuite
	public void generatereport()
	{
		System.out.println("generate report");
	}*/
	
	
}
