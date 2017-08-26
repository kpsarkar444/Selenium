package BrowserClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brows {
	
	
	public static WebDriver driver;
	public Brows(){
		
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.irctc.co.in");
		
	}
	  
	  public void run(){
		  
		  
		
		  
	  }

}
