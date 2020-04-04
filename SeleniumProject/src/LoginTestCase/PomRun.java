package LoginTestCase;

import org.openqa.selenium.By;

public class PomRun extends BaseClass  {

	public static void main(String[] args)
	{
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.cssSelector(".login")).click();
		PomLogin login =new PomLogin(driver);
		
		//invalid username & password
		login.setusername("MuthuKuma");
		login.setpassword("Kumar");
		login.setlogin();
		
		//valid username & password
		login.setusername("impsmuthu@gmail.com");
		login.setpassword("abc@123");
		login.setlogin();

	}

}
