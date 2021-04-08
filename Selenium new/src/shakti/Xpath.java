package shakti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakti Ray\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//xpath by attribute
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shaktray.guddu@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Shakti@786");
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		//*driver.close();
		
		//xpath by text
		//*driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		
		//xpath by contains
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		
		
	

	}

}
