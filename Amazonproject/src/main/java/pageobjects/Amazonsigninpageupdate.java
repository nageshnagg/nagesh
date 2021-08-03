package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;

public class Amazonsigninpageupdate extends Amazonsigninpage {

	public Amazonsigninpageupdate() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebElement getelement(String locator) {
		WebElement e = null;
		if (locator.endsWith("id")) {
			e = driver.findElement(By.id(prop.getProperty(locator)));
		} else if (locator.endsWith("class")) {
			e = driver.findElement(By.className(prop.getProperty(locator)));
		} else if (locator.endsWith("xpath")) {
			e = driver.findElement(By.xpath(prop.getProperty(locator)));
		} else if (locator.endsWith("css")) {
			e = driver.findElement(By.cssSelector(prop.getProperty(locator)));
		} else if (locator.endsWith("linktext")) {
			e = driver.findElement(By.linkText(prop.getProperty(locator)));
		}
		return e;
	}

	public void navigat(String url) {
		driver.navigate().to(prop.getProperty(url));
		
	}

	public void signinmenu(String locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getelement(locator)).build().perform();
	}

	public void signin(String locator) {
		getelement(locator).click();
	
	}

	public void username(String locator, String username) {
		getelement(locator).sendKeys(username);
		;
	}

	public void continuee(String locator) {
		getelement(locator).click();
	}

	public void password(String locator, String username) {
		getelement(locator).sendKeys(username);
		;
	}

	public void submit(String locator) {
		getelement(locator).click();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		
		driver.quit();
	}
}
