/**
 * 
 */
package secondTest;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot
{

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			driver.findElement(By.xpath("//*[@alt=\"Continue shopping\"]")).click();
		}catch(Exception e){
			//System.out.println(e.getMessage());
		}
		finally {
		String mobileName = "Samsung Galaxy";
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(mobileName);
		driver.findElement(By.id("nav-search-submit-button")).click();
		int num = 2;
		
		List<WebElement> titles =driver.findElements(By.xpath("//*[@data-cy='title-recipe']/a/h"+num+"/span[starts-with(text(),'"+mobileName+"')]"));
		List<WebElement>prices=driver.findElements(By.xpath("//*[@data-cy='title-recipe']/a/h2/span[starts-with(text(),'"+mobileName+"')]/parent::h2/parent::a/parent::div/parent::div/div[3]//span[@class=\"a-price\"]"));
		System.out.println(titles.size());
		System.out.println(prices.size());
		for(int i=0; i<titles.size();i++ ) {
			System.out.println(i+1+" . "+titles.get(i).getText());
			System.out.println("    "+prices.get(i).getText());
		}
		driver.quit();
		}
	}

}
