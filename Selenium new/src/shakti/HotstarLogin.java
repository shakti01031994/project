package shakti;

import java.security.acl.NotOwnerException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class HotstarLogin {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:/Users/Shakti Ray/Downloads/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("https://www.hotstar.com/in");
    driver.findElement(By.xpath("//div[contains(text(),'LOGIN')]")).click();
    driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys(String.valueOf("9776161516"));
    driver.findElement(By.xpath("//button[@class='submit-button']")).click();
  // List<WebElement> otp= driver.findElements(By.xpath("//input")[1]);
   WebDriverWait wait=new WebDriverWait(driver,30);
   try{
	   
    wait.until(ExpectedClassVisibilityOfElementLocated(By.xpath("//button[@class='submit-button']")));
   }
   catch(NullPointerException e)
   {
	   System.out.println("element not found");
   }
   try
   {
	   driver.findElement(By.xpath("//button[@class='submit-button']")).click();
   }
   catch(NullPointerException c)
   {
	  System.out.println("otp is invalid");
   }
	 System.out.println(driver.getTitle());
   
	}

	private static Predicate<WebDriver> ExpectedClassVisibilityOfElementLocated(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
