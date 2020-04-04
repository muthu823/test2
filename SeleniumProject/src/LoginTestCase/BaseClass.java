package LoginTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	static
	{
		 System.setProperty("webdriver.chrome.driver", 
	     		"E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	public static WebDriver driver=new ChromeDriver();

}
