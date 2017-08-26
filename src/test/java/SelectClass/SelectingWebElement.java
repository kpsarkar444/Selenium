package SelectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectingWebElement {
	static WebDriver driver=null;
	@Test
	public static void Select(){
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		Xpath x=new Xpath(driver);
		Select s=new Select(x.SelectDay);
		s.selectByValue("27");
		
		
	}
	

}
