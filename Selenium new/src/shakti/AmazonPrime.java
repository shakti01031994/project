package shakti;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class AmazonPrime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakti Ray\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(String.valueOf("9168015268"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bonu@1994");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedClassVisibilityOfElementLocated(By.xpath("//a[@class='pv-nav-logo']")));
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("kong skull island");
		List<WebElement> suggestions=driver.findElements(By.xpath("//a/strong[contains(text(),'kong skull island')]"));
		System.out.println(suggestions.size());
		suggestions.get(2).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Kong: Skull Island')]")).click();
		WebElement description=driver.findElement(By.xpath("//div[contains(@data-automation-id,'atfSynopsisExpander')]"));
		System.out.println(description.getText());
		
		
		
		

	}

	private static Predicate<WebDriver> ExpectedClassVisibilityOfElementLocated(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
