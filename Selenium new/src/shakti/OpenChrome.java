package shakti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenChrome {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:/Users/Shakti Ray/Downloads/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			//WebElement login= driver.findElement(By.xpath("//a[contains(text(),'Login')])"));
			/*Select sel=new Select(login);
			sel.selectByVisibleText("My Profile");*/
			/*Actions act=new Actions(driver);
			act.moveToElement(login).perform();*/
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9776161516");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shakti@05");
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			//driver.getTitle();driver.quit();

	}

}
