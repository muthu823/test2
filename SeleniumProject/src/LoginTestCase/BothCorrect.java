package LoginTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class BothCorrect extends BaseClass
{

	String [][] data= {{"Admin","adnmin123"},
			{"admin","admin344"},
			{"admin","abc123"},
			{"Admin","admin123"}};

	@DataProvider(name="Credentialpass")
	public String [][] data()
	{
		return data;
	}


	@Test(dataProvider = "Credentialpass")
	public void bothcorrect(String username,String password)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys(username);

		WebElement upasw = driver.findElement(By.id("txtPassword"));
		upasw.sendKeys(password);

		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();

	}
	@Test
	public void close()
	{
		driver.close();
	}



}
