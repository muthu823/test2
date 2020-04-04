package LoginTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin
{
 //declaration
	@FindBy(id="email")
	public WebElement untxt;
	@FindBy(name="passwd")
	public WebElement pswtxt;
	@FindBy(id="SubmitLogin")
	public WebElement login;
	
	//initialization
	
	public PomLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	Utilize the element
	
	public void setusername(String Username)
	{
		untxt.clear();
		untxt.sendKeys(Username);
	}
	public void setpassword(String password)
	{
		pswtxt.clear();
		pswtxt.sendKeys(password);
	}
	public void setlogin()
	{
		login.click();
	}
	
	
	
}
