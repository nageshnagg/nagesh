package amazon;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pageobjects.Amazonsigninpageupdate1;
import pageobjects.Testbasepage;
import testng.Extentmanager;

public class Amazonupdate1 {
	
	 public ExtentReports rep;
		public ExtentTest test;

		@BeforeTest
		public void report(ITestContext result)
		{
		 rep=Extentmanager.exreport();
		 test = rep.createTest(result.getName());
		}
		
		@AfterTest
	    public void flush()
	    {
			rep.flush();
	    }

	

	@Test
	public void Amazonlogin() throws IOException, InterruptedException
	{
		Amazonsigninpageupdate1 amazon =new Amazonsigninpageupdate1();
	
		amazon.launchbrowser("chrome");
		test.log(Status.INFO,"opening chrome");
		amazon.navigat("url");
		test.log(Status.PASS," gone to website ");
		System.out.println(amazon.iselementpresent("signinmenu_id"));
		amazon.signinmenu("signinmenu_id");
		amazon.signin("signin_linktext");
		test.log(Status.INFO,"log in to amazon");
		System.out.println(amazon.iselementpresent("username_id"));
		amazon.username("username_id","8374566994");
	    amazon.continuee("continue_xpath");
	    amazon.password("password_id","nag66994");
	    amazon.submit("submit_id");
	    Thread.sleep(2000);
	    test.log(Status.PASS,"closing chrome");
	    amazon.quit();
	
	}

}
