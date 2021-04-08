package testNG;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DatadrivenTest {
WebDriver driver;


@BeforeMethod
public void setup(){
	System.setProperty("webdriver.chrome.driver","C:/Users/Shakti Ray/Downloads/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.get("http:www.google.com");
}
    







    
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }

}
