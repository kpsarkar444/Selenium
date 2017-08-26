package Deriver;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	
	
	@Test
	@Parameters({"browserType"})
	public static void Broowser(String browserName){
		 WebDriver driver=null;
		DesiredCapabilities cap=null;
		Platform os=Platform.ANY;
		
		if(browserName.equalsIgnoreCase("firefox")){
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("Firefox");
			cap.setPlatform(os);
		}
		
		else if(browserName.equalsIgnoreCase("chrome")){
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("Chrome");
			cap.setPlatform(os);
		}
		else if(browserName.equalsIgnoreCase("ie")){
			cap=DesiredCapabilities.internetExplorer();
			cap.setBrowserName("ie");
			cap.setPlatform(os);
		}
		
		URL url=null;
		
		try{
			url=new URL("http://192.168.0.102:4444/wd/hub");
		}
		catch(Exception e){
			e.getMessage();
		}
		
		driver=new RemoteWebDriver(url, cap);
		driver.get("https://www.facebook.com");
		driver.close();
		
		
		
		
		
	}
	
	
	

}
