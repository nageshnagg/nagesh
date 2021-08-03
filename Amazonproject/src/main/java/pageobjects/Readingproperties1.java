package pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Readingproperties1 {
	 public Properties prop;
	 public Properties aprop;
	 
	@Test
	public void app() throws IOException
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
    System.out.println(aprop.getProperty("name"));
	}
}
