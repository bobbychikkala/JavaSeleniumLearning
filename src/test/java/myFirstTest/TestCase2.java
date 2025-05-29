package myFirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver ();
		Options option =driver.manage();
		Window window=option.window();
		window.maximize();
		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-1/");
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Bobby");
		driver.findElement(By.xpath("//*[@id=\"submitForm\"]")).click();
	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//driver.findElement(By.partialLinkText("ultimate")).click();
		WebElement e =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'services')]")));
		e.click();
	}

}
