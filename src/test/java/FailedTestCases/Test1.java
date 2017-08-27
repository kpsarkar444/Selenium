package FailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void m1(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("FIREFOX browser open");
		driver.close();
	}

}
