package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testbasepage {

	public WebDriver driver;

	public WebDriver launchbrowser(String browser) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("fox")) {
			System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D://drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D://drivers//msedgedriver.exe");
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public void gotowebsite(String site)
	{
		driver.get(site);
	}

}
