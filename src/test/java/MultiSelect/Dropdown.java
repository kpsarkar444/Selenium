package MultiSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	public void MultiSelect(){
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement e = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(e);
		if(sel.isMultiple()){
			sel.selectByValue("19");
		}
		else
		{
			System.out.println("Its not multiselect");
		}
		
		
	}

}
