package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assert {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver","C:/Users/Shakti Ray/Downloads/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.get("http:www.google.com");
	}
	
	@Test
	public void googleTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		org.testng.Assert.assertEquals(title, "Google","title not match");
		
	}
	@Test
	public void logoText()
	{
		boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		org.junit.Assert.assertTrue(b);
		
		
	}
	
	@AfterMethod
	public  void tearDown()
	{
		driver.quit();
	}

}
