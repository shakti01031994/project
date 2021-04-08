package shakti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakti Ray\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		//ID locator
		driver.findElement(By.id("email")).sendKeys(" ");
		driver.findElement(By.id("pass")).sendKeys(" ");
		
		//name locator
		//*driver.findElement(By.name("login")).click();
		
		//linktext locator
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partial linktext
		WebElement link=driver.findElement(By.partialLinkText("Forgotten password?"));
		link.getText();
		link.click();
		
		
		
		
		

	}

}
