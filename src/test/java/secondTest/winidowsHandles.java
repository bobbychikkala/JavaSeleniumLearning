package secondTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class winidowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.axisbank.com/");
		driver.findElement(By.xpath("(//*[@title='Register for WhatsApp Banking'])[1]")).click();
		
		Set<String> windowsIDs =driver.getWindowHandles();
		Iterator<String> iterate=windowsIDs.iterator();
		iterate.next();
		String secondWinID =iterate.next();
		driver.switchTo().window(secondWinID);
		
		driver.findElement(By.cssSelector("input#txt_txtMobile")).sendKeys("9494722");
		driver.findElement(By.cssSelector("input#txt_txtMobile")).sendKeys("772");
		WebElement countryCode = driver.findElement(By.xpath("//*[@title=\"Country Code\"]"));
		Select dp = new Select(countryCode);
		dp.selectByValue("355");
		
		List<WebElement> dplist =driver.findElements(By.xpath("//option"));
		
		for (WebElement dpsel:dplist) {
			
			
			if(dpsel.getAttribute("value").equals("685")) {
				System.out.println(dpsel.getText());
				dpsel.click();
				break;
				
			}
		}
		

	}

}
