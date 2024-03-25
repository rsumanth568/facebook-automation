package sumanth;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webautomation
{
	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// Disables chrome browser notifications
		WebDriver driver = new ChromeDriver(options);
		// Invokes Chrome browser
		driver.get("https://www.facebook.com/");
		// Hits facebook login page
		driver.findElement(By.cssSelector("input[autofocus='1']")).sendKeys("ramadugusumanth0@gmail.com");
		// Locates username element and enters value
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Naga#124");
		// Locates password element and enters value
		driver.findElement(By.cssSelector("button[name='login']")).click();
		// Locates and Clicks the sign in button
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='image'])[1]")));
		// waits untill expected element is visible
		driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
		// Locates and clicks on profile picture
		driver.findElement(By.partialLinkText("Log Out")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		// Logout the account
		driver.close();
		// Closes the current tab in browser
		
	}

}