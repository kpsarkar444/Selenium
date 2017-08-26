package Window;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandle {
	
	@Test
	public void HandlingWindow() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		
		WebElement e = driver.findElement(By.xpath("//a[@id='irctc_tourism']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@href='http://www.the-maharajas.com/'])[1]")).click();
		Thread.sleep(3000);
		
		String main = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		
		for(String s:set){
			if(!s.equalsIgnoreCase(main)){
				driver.switchTo().window(s);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[contains(@href,'http://www.the-maharajas.com/cgi-bin/dev1.dll')])[3]")).click();
				String title=driver.getTitle();
				System.out.println(title);
				break;
			}
		}
		driver.close();
		driver.switchTo().window(main);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		Alert alt = driver.switchTo().alert();
		String altext = alt.getText();
		System.out.println(altext);
		System.out.println("*******");
		alt.accept();
		String mainTitle = driver.getTitle();
		System.out.println("Main Title is : " + mainTitle);
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
