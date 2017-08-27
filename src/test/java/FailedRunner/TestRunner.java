package FailedRunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {
	
	public static void main(String[] args){
		
		TestNG test=new TestNG();
		
		List<String> lst=new ArrayList<String>();
		
		lst.add("C:\\Users\\Magushai OOONNNNGGGG\\workspace\\Selenium\\test-output\\Suite\\testng-failed.xml");
		
		test.setTestSuites(lst);
		
		test.run();
		
	}

}
