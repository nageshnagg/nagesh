package pageobjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import testng.Extentmanager;

public class Amazonsigninpageupdate1 extends Amazonsigninpageupdate  {

	public Amazonsigninpageupdate1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public By getlocator(String locator)
	{
		By by=null;
		if(locator.endsWith("_id"))
		{
			by=By.id(prop.getProperty(locator));
		}
		else if(locator.endsWith("_classname"))
		{
			by=By.className(prop.getProperty(locator));
		}
		else if(locator.endsWith("_xpath"))
		{
			by=By.xpath(prop.getProperty(locator));
		}else if(locator.endsWith("_linktext"))
		{
			by=By.linkText(prop.getProperty(locator));
		}
		else if(locator.endsWith("_css"))
		{
			by=By.cssSelector(prop.getProperty(locator));
		}
		
		return by ;
	}
	public WebElement getelements(String locator)
	{
		
		return driver.findElement(getlocator(locator));
		}

	public boolean iselementpresent(String locator)
	{
		if(getelements(locator).isDisplayed())
		{
			return true;
			}
		return false;
	}
	
	public void waitforelement(String locator)
	{
		if(!iselementpresent(locator))
		{
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(getlocator(locator)));	
		}
	
	}


}
