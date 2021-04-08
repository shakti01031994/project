package shakti;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:/Users/Shakti Ray/Downloads/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("https://www.gsmarena.com/");
     driver.getTitle();
     List<WebElement> links=driver.findElements(By.xpath("//table//a"));
     System.out.println(links.size());
     for(int i=0;i<links.size();i++)
     {
    	 System.out.println(links.get(i).getText());
    	System.out.println(links.get(i).getAttribute("href"));
    	 
     }
	}

}
