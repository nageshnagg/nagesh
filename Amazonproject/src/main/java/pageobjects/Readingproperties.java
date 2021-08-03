package pageobjects;

import java.io.FileInputStream;
import java.util.Properties;



public class Readingproperties {
	Properties prop;
	 
	
	public Properties property()
	 {
	 	String path=System.getProperty("user.dir")+"//src//test//resources//Project.properties";
	 	try{
	 		FileInputStream fs=new FileInputStream(path);
	 		 prop=new Properties();
	         prop.load(fs);
	 	}
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 	}
	 	prop.getProperty("url");
	 return prop;
	 }
	public static void main(String args[][])
	{
		Readingproperties rr=new Readingproperties();
		rr.property();
	}
			
}
