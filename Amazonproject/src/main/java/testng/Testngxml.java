package testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Testngxml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		XmlSuite suite=new XmlSuite();
		suite.setName("Suite");
		
		XmlTest test=new XmlTest(suite);
		test.setName("Test");
		
		List<XmlClass> classs= new ArrayList<XmlClass>();
		classs.add(new XmlClass("amazon.Amazonupdate1"));
		test.setXmlClasses(classs);
		
		
		List<XmlSuite> suites= new ArrayList<XmlSuite>();
		suites.add(suite);
		
		

		TestNG testng=new TestNG();
		testng.setXmlSuites(suites);
		testng.run();
	}

}
