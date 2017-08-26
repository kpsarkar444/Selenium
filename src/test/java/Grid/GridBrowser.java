package Grid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridBrowser {
	
	@Test
	@Parameters({"browsertype"})
	public void Grid(String browser){
		
		WebDriver driver = null;
		DesiredCapabilities cap=null;
		Platform os=Platform.ANY;
		
		if(browser.equalsIgnoreCase("firefox")){
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(os);
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(os);
		}
		
		else if(browser.equalsIgnoreCase("ie")){
			cap=DesiredCapabilities.internetExplorer();
			cap.setBrowserName("ie");
			cap.setPlatform(os);
			
		}
		
		URL url=null;
		try{
			url=new URL("http://10.245.138.166:4444/wd/hub");
		}
		catch(Exception e){
			e.getMessage();
		}
		
		driver=new RemoteWebDriver(url,cap);
		
		
		
		
		
		
	}

}
