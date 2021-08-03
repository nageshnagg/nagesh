package pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testng.Extentmanager;

public class Testbasepage {
	 public WebDriver driver;
	 public Properties prop;
	 public Properties aprop;
	 
	
		
	 public WebDriver launchbrowser(String browser) throws IOException
	 {
		 if(browser.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver","D://drivers//chromedriver.exe");
			 driver =new ChromeDriver();
	         driver.manage().window().maximize();
	         
		 }
		 else if(browser.equals("fox")) {
			
			 
		 }
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 return driver;
	 }
	
	
}
