package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import amazonpageobjects.Amazonloginpage;
import base.Testbasepage;
import reports.Extentreportsmanager;


@Listeners(reports.Testnglisteners.class)
public class Amazonlogin extends Testbasepage{

	ExtentReports rep;
	ExtentTest test;
	
	@BeforeTest
	public void initializereports(ITestContext context)
	{
		rep=Extentreportsmanager.getreports();
	    test=rep.createTest(context.getCurrentXmlTest().getName());
	   
	    context.setAttribute("test",test);
	    test=(ExtentTest) context.getAttribute("test");
	}
	
/*	@BeforeMethod
	public void getattributes(ITestContext context)
	{
	test=(ExtentTest) context.getAttribute("test");
		
	}*/
	
	@Test
	public void logintoamazon()
	{
		launchbrowser("chrome");
		test.log(Status.INFO,"opened chrome");
		gotowebsite("https://www.amazon.in/");
		test.log(Status.INFO,"entering to site");
		Amazonloginpage amaze=new Amazonloginpage(driver,test);
		test.log(Status.INFO,"clicking on signin");
		amaze.signin();
		test.log(Status.INFO,"clicking on username");
		amaze.username();
		test.log(Status.INFO,"clicking on continue");
		amaze.continuee();
		test.log(Status.INFO,"clicking on password");
		amaze.password();
		test.log(Status.INFO,"clicking on submit");
		amaze.submit();
	//	test.log(Status.INFO,"opened chrome");
		}
	
	
	
	
	@Test(priority=2)
	public void addtocart()
	{
		
		WebElement sam=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//	sam.sendKeys("Samsung Galaxy M42 5G");
		Actions act =new Actions(driver);
		act.moveToElement(sam).sendKeys("Samsung Galaxy M42 5G").keyDown(Keys.ARROW_DOWN).click().build().perform();	
		
	}
	
	
	
	/*
	@Test(priority=3)
	public void deleteitemfromcart() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		Thread.sleep(2000);
	List<WebElement>mobiles=driver.findElements(By.xpath("//span[@class='a-truncate-cut']"));
		for(WebElement mobile:mobiles)
		{
			System.out.println(mobile.getText());
			if(mobile.getText().contains("Samsung Galaxy M42"))
			{
               driver.findElement(By.xpath("//input[@name=\"submit.delete.Ce0c7d6d5-7eb5-4dcb-8298-cd7b92f78b65\"]")).click();
			}
		}
	}
	*/
	@AfterTest
	public void generatereports()
	{
		rep.flush();
		//driver.quit();
	}
	
	
	
	
	
}
