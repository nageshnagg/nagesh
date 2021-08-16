package reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportsmanager {

	public static ExtentReports reports;

	public static ExtentReports getreports() {
		if (reports == null) {

			Date d = new Date();
			d.toString();
		String s="D:\\reportss\\"+d.toString().replaceAll(":","-");
		//	File f=new File(s);
			//f.mkdir();

			reports = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(s);
			spark.config().setReportName("amazonsite");
			spark.config().setTheme(Theme.DARK);

			reports.attachReporter(spark);
		}
		return reports;
	}
}
