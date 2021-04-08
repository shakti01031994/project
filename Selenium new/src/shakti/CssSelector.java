package shakti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args)
	{	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakti Ray\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.cssSelector("input[name=email]")).sendKeys("shaktiray.guddu@gmail.com");
	driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("Shakti@786");
	driver.findElement(By.cssSelector("button[name=login]")).click();
	driver.close();
		
		

	}

}
