package shakti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCheckBox {

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver","C:/Users/Shakti Ray/Downloads/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     driver.get("https://accounts.google.com");
     driver.getTitle();
     driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("shaktiray.guddu");
     driver.findElement(By.xpath("//button[.='Next']")).click();
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shakti@786");
     driver.findElement(By.xpath("//button[.='Next']")).click();
     driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
     
	}

}
