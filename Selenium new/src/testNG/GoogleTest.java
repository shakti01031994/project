package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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
@Test(priority=1,groups="title")
public void googleTitle()
{
	String title=driver.getTitle();
	System.out.println(title);
}

@Test(priority=3,groups="logo")
public void logoText()
{
	boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	
	
}

@Test(priority=2,groups="link text")
public void gmailLInk(){
	boolean l=driver.findElement(By.linkText("Gmail")).isDisplayed();
}




@AfterMethod
public  void tearDown()
{
	driver.quit();
}
}
