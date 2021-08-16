package amazonpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Amazonloginpage {

	public WebDriver driver;
	
	public ExtentTest test;
	
	public Amazonloginpage(WebDriver driver,ExtentTest test)
	{
		
	    this.driver=driver;
		this.test=test;
	    PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="nav-link-accountList")
	WebElement signin;
	
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continuee;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement submit;
	
	public void click(WebElement e)
	{
		e.click();
	}
	public void sendkeys(WebElement c,String name) 
	{
	  c.sendKeys(name);
	}
	
	public void signin()
	{
		signin.click();
	}
	public void username()
	{
		username.sendKeys("8374566994");
		test.log(Status.INFO,"entered mobilenumber");
	}
	
	public void continuee()
	{
		continuee.click();
	}
	
	public void password()
	{
		password.sendKeys("nag666994");
		
		test.log(Status.INFO,"entered password");
	}
	
	public void submit()
	{
		submit.click();
	}
	
}
