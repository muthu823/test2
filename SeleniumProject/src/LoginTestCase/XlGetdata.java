package LoginTestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XlGetdata
{
	 
	ArrayList<String> username =new ArrayList<String>();
	ArrayList<String> password =new ArrayList<String>();
	
	public void xlgetdata( ) throws Exception
	{
		FileInputStream file=new FileInputStream("F:\\XLDemo\\XlDemo.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		Sheet sheet = wb.getSheetAt(0);
		int TotalRowCount = wb.getSheetAt(0).getLastRowNum();
		for(int i=1;i<=TotalRowCount;i++)
		{
			username.add( wb.getSheetAt(0).getRow(i).getCell(0).toString());
			password.add( wb.getSheetAt(0).getRow(i).getCell(1).toString());
			//System.out.println(un + " : " + psw);
		}
		
		
		
	}
	
	public void executetest()
	{
		for (int i=0;i<username.size();i++)
		{
			bothcorrect(username.get(i),password.get(i));
		}
	} 
	
	

public void bothcorrect(String username,String password )
	{
	System.setProperty("webdriver.chrome.driver", 
     		"E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys(username);
		
		WebElement upasw = driver.findElement(By.id("txtPassword"));
		upasw.sendKeys(password);
		
		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();
		
		driver.quit();
		
	}

public static void main(String[] args) throws Exception {
	XlGetdata Data=new XlGetdata();
	
	Data.xlgetdata();
	Data.executetest();
	
}
}
