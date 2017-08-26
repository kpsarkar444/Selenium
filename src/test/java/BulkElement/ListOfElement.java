package BulkElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListOfElement {
	
	@Test
	public void getElement(){
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bangaloreproperties.com/");
		
		WebElement e = driver.findElement(By.xpath("//iframe[@src='seller.asp']"));
		driver.switchTo().frame(e);
		
		List<WebElement> ls =driver.findElements(By.xpath("//select[@name='area']"));
		
		
		for(int i=0; i<ls.size(); i++){
			String text = ls.get(i).getText();
			System.out.println(text);
			System.out.println("****");
			
		}
		
		WebElement e3 = driver.findElement(By.xpath("//select[@name='area']"));
		Select sel=new Select(e3);
		boolean m = sel.isMultiple();
		System.out.println(m);
		List<WebElement> op = sel.getOptions();
		System.out.println(op);
		sel.selectByIndex(20);
		
	}

}
