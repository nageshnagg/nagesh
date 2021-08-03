package amazon;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.Amazonsigninpage;

public class Amazon {

	
	
	@Test
    public void test() throws IOException, InterruptedException
    {
		Amazonsigninpage app=new Amazonsigninpage();
		app.launchbrowser("chrome");
		
		app.geturl("url");
		app.signinmenuxmouseover("signinmenu");
		Thread.sleep(5000);
		app.signinbylink("signin");
		app.idusername("username","8374566994");
		Thread.sleep(2000);
		app.xpathcontinue("continue");
		app.idpassword("password","nag66994");
		app.idsubmit("submit");
    }


}
