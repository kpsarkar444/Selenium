package Download;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FileDownload {
	static WebDriver driver=null;
	
	@Test
	public void Test1() throws Exception{
		
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.dir", "E:/");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "File");
		
		driver=new FirefoxDriver(profile);
		driver.manage().window().maximize();
		driver.get("https://drive.google.com/drive/my-drive");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sarkar.pranay22@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("A.p-1_!~@#");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//div[@id=':1b']/div[1]"));
		Actions act=new Actions(driver);
		act.contextClick(e).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		Thread.sleep(5000);
				
		
	}
	
	@AfterMethod
	public void TearDown(){
		driver.close();
	}

}
