package Assertion;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertclass {
	@Test
	public void Assert1() throws Exception {
		String expected ="Facebook – log in or sign up";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		Thread.sleep(5000);

		String text = driver.getTitle();
		
		
		Assert.assertEquals(expected, text,"title is not verified");
		System.out.println("title is verified");
		driver.close();

	}

}
