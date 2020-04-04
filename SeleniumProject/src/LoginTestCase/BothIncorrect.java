package LoginTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothIncorrect extends BaseClass
{
	
	
	@Test
	@Parameters({"username","password"})
	public void bothwrong(String username ,String password)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys(username);
		
		WebElement upasw = driver.findElement(By.id("txtPassword"));
		upasw.sendKeys(password);
		
		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();
		
		driver.quit();
		
	}
}
