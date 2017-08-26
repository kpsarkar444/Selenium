package Assertion;

import org.testng.annotations.Test;

public class Assert {
	@Test
	public void Assert1() throws Exception {
		String expected ="Facebook";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		Thread.sleep(5000);

		String text = driver.getText();
		Assert.assertEquals("ecpected, text","title is not verified");
		System.out.println("title is verified");
		driver.close();

	}

}
