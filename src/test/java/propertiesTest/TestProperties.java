package propertiesTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestProperties {
	 public static WebDriver driver = null;
	 public static void main(String[] args) throws IOException {
	  
	  Properties OR = new Properties();
	  FileInputStream fis = new FileInputStream("./src/test/resources/properties/OR.properties");
	  OR.load(fis);
	  
	  System.out.println(OR.getProperty("username_XPATH"));
	  
	  Properties config = new Properties();
	  fis = new FileInputStream("./src/test/resources/properties/config.properties");
	  config.load(fis);
	  
	  if(config.getProperty("browser").equals("chrome"))
	  {
	  driver = new ChromeDriver();
	  }else if(config.getProperty("browser").equals("firefox"))
	  {
	   driver = new FirefoxDriver();
	  }else if(config.getProperty("browser").equals("edge"))
	  {
	   driver = new EdgeDriver();
	  }else if(config.getProperty("browser").equals("safari"))
	  {
	   driver = new SafariDriver();
	  }
	  driver.get(config.getProperty("testsiteurl"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(config.getProperty("implicitWait"))));
	  
	  driver.findElement(By.xpath(OR.getProperty("username_XPATH"))).sendKeys("hemantgandhi");
	  driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys("sdfssddfsfs");
	  driver.findElement(By.name(OR.getProperty("name_NAME"))).click();
	  
	 }
	 }


