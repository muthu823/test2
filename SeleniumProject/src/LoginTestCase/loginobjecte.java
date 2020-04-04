package LoginTestCase;

import java.sql.Driver;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginobjecte extends BaseClass

{
	@Test
	public void googlepage() throws InterruptedException
	{
		driver.get("https://www.google.com/");
//		WebElement findElement = driver.findElement(By.name("q"));
//		findElement.sendKeys("nao");
//		Thread.sleep(5000);
//		List<WebElement> list 
//		= driver.findElements(By.xpath("//input[@name='q']//following ::li"));
//		for (WebElement webElement : list) 
//		{
//			String s=webElement.getText();
//			System.out.println(s);
//		}
	}
	
}
