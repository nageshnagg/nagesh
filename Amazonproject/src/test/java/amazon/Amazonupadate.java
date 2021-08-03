package amazon;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.Amazonsigninpageupdate;

public class Amazonupadate {
	
	
	@Test
	public void Amazonlogin() throws IOException, InterruptedException
	{
		Amazonsigninpageupdate amazon =new Amazonsigninpageupdate();
	
		amazon.launchbrowser("chrome");
		amazon.navigat("url");
		amazon.signinmenu("signinmenu_id");
		amazon.signin("signin_linktext");
		amazon.username("username_id","8374566994");
	    amazon.continuee("continue_xpath");
	    amazon.password("password_id","nag66994");
	    amazon.submit("submit_id");
	    Thread.sleep(2000);
	    amazon.quit();
	
	}

}
