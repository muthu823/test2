package LoginTestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CongigExample 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver = null;
	FileInputStream file =new FileInputStream("Config.properties");
	Properties p=new Properties();
	p.load(file);
	
	String Browser = p.getProperty("Browser");
	String driverlocation = p.getProperty("driverlocation");
	
	if(Browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", driverlocation);
		 driver = new ChromeDriver();
		 
	}
	else if(Browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", driverlocation);
		 driver = new FirefoxDriver();
	}
	
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Arukam Tecnologeis " +Keys.ENTER);
	
	
	
	
	
	
}
}
