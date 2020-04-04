package LoginTestCase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Xlproject 
{
	List<String> uname=new ArrayList<String>();
	List<String> psw=new ArrayList<String>();


	public void readxldata() throws Exception
	{

		FileInputStream file=new FileInputStream("F:\\XLDemo\\XlDemo.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = wb.getSheet("Sheet1").getLastRowNum();
		for(int i=0;i<=lastRowNum;i++)
		{
			uname.add(wb.getSheet("Sheet1").getRow(i).getCell(0).toString());
			psw.add(wb.getSheet("Sheet1").getRow(i).getCell(1).toString());

		}
	}
	public void readxldatanew () throws Exception
	{

		FileInputStream file=new FileInputStream("F:\\XLDemo\\XlDemo.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = wb.getSheet("Sheet1").getLastRowNum();
		int lastcolnum=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		Object [][] ar=new Object[lastRowNum+1][lastcolnum];
		for(int i=0;i<=lastRowNum;i++)
		{
			
		}
	}
	public void login()
	{
		for(int i=0;i<uname.size();i++)
		{
			bothcorrect(uname.get(i),psw.get(i) );
			
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

	public static void main(String[] args) throws Exception
	{
		Xlproject data=new Xlproject();
		data.readxldata();
		data.login();
	}
}
