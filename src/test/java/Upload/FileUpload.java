package Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUpload {
	
	static WebDriver driver=null;
	
	@Test
	public static void  upload() throws Exception{
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://drive.google.com/drive/my-drive");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sarkar.pranay22@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("A.p-1_!~@#");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='a-D-B-x']/div/div[1]/button[1]")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Magushai OOONNNNGGGG\\Desktop\\Fileupload.exe");
		Thread.sleep(3000);
		
		
		
	}
}
