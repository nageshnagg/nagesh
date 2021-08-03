package pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazonsigninpage extends Testbasepage {

	public Amazonsigninpage() throws IOException
	{
String path=System.getProperty("user.dir")+"//src//test//resources//Project.properties";
	 	
	 		FileInputStream fs=new FileInputStream(path);
	 		 prop=new Properties();
	         prop.load(fs);
	       String amazon=prop.getProperty("file")+".properties";
	       path=System.getProperty("user.dir")+"//src//test//resources//"+amazon;
	       fs=new FileInputStream(path);
	       aprop=new Properties();
	       aprop.load(fs);
	       aprop.getProperty(name);
	}
	public void geturl(String url) {
		driver.get(prop.getProperty(url));

	}

	public void signinmenuxmouseover(String id) {
		Actions act = new Actions(driver);
		act.moveToElement(getelementbyid(prop.getProperty(id))).build().perform();
	}

	public void signinbylink(String linktext) {
		driver.findElement(By.linkText(prop.getProperty(linktext))).click();
	}

	public WebElement getelementbyid(String idlocator) {
		return driver.findElement(By.id(idlocator));
	}

	
	public WebElement getelementbyxpath(String xpathlocator) {
		return driver.findElement(By.xpath(xpathlocator));
	}

	public void idusername(String idlocator, String keys) {
		getelementbyid(prop.getProperty(idlocator)).sendKeys(keys);
	}

	public void idpassword(String idlocator, String keys) {
		getelementbyid(prop.getProperty(idlocator)).sendKeys(keys);
	}

	public void xpathcontinue(String xpathlocator) {
		getelementbyxpath(prop.getProperty(xpathlocator)).click();
	}

	public void idsubmit(String id) {
		getelementbyid(prop.getProperty(id)).click();
	}
	@Test
	public void aa()
	{
		System.out.println(prop.getProperty("url"));
	}
	
}
