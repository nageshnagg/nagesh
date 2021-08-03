package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentmanager {
 public static	ExtentReports extent;
 
	
	
	public static ExtentReports exreport()
	{if(extent==null)
	{ 	
		
		 extent= new ExtentReports();
		
		ExtentSparkReporter spark= new ExtentSparkReporter("D://extentreport");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("nagesh24731");
		spark.config().setDocumentTitle("Amazon website");
	   
		extent.attachReporter(spark);
	}	
		return extent;	
	}
	

}
