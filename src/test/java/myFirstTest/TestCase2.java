package myFirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//WebDriver driver = new FirefoxDriver ();
//		browserTest("Chrome");
//		browserTest("edgE");
		browserTest("Chroe");
	
	}
	
	static void browserTest(String browser) {
		WebDriver driver ;
		switch(browser.toLowerCase()){
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				browser= "Edge";
				break;
			default:
				driver = new FirefoxDriver ();
				browser = "FireFox";
		}
		
		Options option =driver.manage();
		Window window=option.window();
		window.maximize();
		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-1/");
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Bobby");
		driver.findElement(By.xpath("//*[@id=\"submitForm\"]")).click();
	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//	driver.findElement(By.xpath("//*[contains(text(),'services')]")).click();
		WebElement e =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'services')]")));
		e.click();
	
		System.out.println(driver.getTitle()+"Tested on "+browser);
		driver.quit();
	}

}
