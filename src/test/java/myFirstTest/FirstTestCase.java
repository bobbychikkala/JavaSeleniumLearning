package myFirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.journeytoautomation.org/Authentication");
	Options options=driver.manage();
	Window window=options.window();
	window.maximize();
	options.timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement email =driver.findElement(By.xpath("//*[contains(@id,\"email\")]"));
	email.sendKeys("admin");
	WebElement nextButton  = driver.findElement(By.xpath("//*[contains(text(),\"Next\")]"));
	nextButton.click();
	
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	password.sendKeys("admin");
	
	driver.findElement(By.xpath("//*[@data-testid='submit-button']")).click();
	
	System.out.println(driver.getTitle());
	
	String message = driver.findElement(By.tagName("p")).getText();
	System.out.println(message);
	driver.quit();
	}

}
