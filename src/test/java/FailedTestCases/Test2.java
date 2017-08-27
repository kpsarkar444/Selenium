package FailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void m2(){
		Assert.assertTrue(false);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Not launch");
	}

}
