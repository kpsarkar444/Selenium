package Dynamic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicSelectBox {
	
	@Test
	public void SelectDynamic() throws Exception{
		
		String expected="Indigo";
		boolean flag=true;
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		
		driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
		String main = driver.getWindowHandle();
		Set<String> second = driver.getWindowHandles();
		for(String s:second){
			if(!s.equalsIgnoreCase(main)){
				driver.switchTo().window(s);
				WebElement e = driver.findElement(By.xpath("//select[@name='airlinePreference']"));
				Thread.sleep(3000);
				Select sel=new Select(e);
				List<WebElement> ls = sel.getOptions();
				for(int i=0; i<ls.size(); i++){
					String text = ls.get(i).getText();
					if(expected.equalsIgnoreCase(text)){
						sel.selectByVisibleText("Indigo");
						flag=false;
						break;
					}
					
					
				}
				if(flag){
					System.out.println("Expected Found");
				}
				else{
					System.out.println("not found the expected one SORRY");
				}
			}
			driver.close();
			
		}
		driver.switchTo().window(main);
		driver.close();
		
		
	}

}
