package shakti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EnterURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//maximize
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		//get title
		String title=driver.getTitle();
		System.out.println(title);
		//*System.out.println(driver.getTitle());
		
		//get current url
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		


	}

}
