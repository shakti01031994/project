package shakti;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//input[@title='Google Search']")).sendKeys("selenium");
    List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
    System.out.println(suggestions.size());
    suggestions.get(4).click();
	}

}
