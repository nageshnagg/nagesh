package amazon;

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

		XmlClass classe=new XmlClass();
		classe.setName("amazon.Amazonupdate1");
		
		List<XmlClass> classs= new ArrayList<XmlClass>();
		classs.add(classe);
		test.setXmlClasses(classs);
		

		List<XmlTest> tests= new ArrayList<XmlTest>();
		tests.add(test);
		
		
		
		List<XmlSuite> suites= new ArrayList<XmlSuite>();
		suites.add(suite);
		
		

		TestNG testng=new TestNG();
		testng.setXmlSuites(suites);
		testng.run();
	}

}
