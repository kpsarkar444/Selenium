package SelectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	
	
		@FindBy(xpath="//select[@id='day']")
		static WebElement SelectDay;
		
		
		
		
	
	
		public Xpath(WebDriver driver){
			PageFactory.initElements(driver,this);
		}





}
