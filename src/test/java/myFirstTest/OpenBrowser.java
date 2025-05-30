package myFirstTest;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser{
	WebDriver driver ;
	
	public OpenBrowser(String browser) {
		browser =browser.toLowerCase();
		switch(browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new ChromeDriver();
		
		}
		
		
	}
	
	void launchWebsite(String url) {driver.get(url);}
	
	void maximizeBrowser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	void clickButton(String locatorType, String LocatorValue) {
		WebElement element = extracted( locatorType, LocatorValue);
		element.click();
		
	}

	void inputTextBox(String locatorType, String LocatorValue,String inputValue) {
		WebElement element=extracted(locatorType, LocatorValue);
		element.sendKeys(inputValue);
		
	}

	private WebElement extracted( String locatorType, String LocatorValue) {
		WebElement element = null;
		locatorType = locatorType.toLowerCase();
		switch(locatorType) {
		
		case "id":
			element =driver.findElement(By.id(LocatorValue));
			break;
		case "tagname":
			element =driver.findElement(By.tagName(LocatorValue));
			break;
		case "classname":
			element =driver.findElement(By.className(LocatorValue));
			break;
		case "cssselector":
			element =driver.findElement(By.cssSelector(LocatorValue));
			break;
		case "linktext":
			element =driver.findElement(By.linkText(LocatorValue));
			break;
		case "partialLinktext":
			element =driver.findElement(By.partialLinkText(LocatorValue));
			break;
		case "name":
			element =driver.findElement(By.name(LocatorValue));
			break;
		case "xpath":
			element =driver.findElement(By.xpath(LocatorValue));
			break;
		}
		return element;
	}

}
