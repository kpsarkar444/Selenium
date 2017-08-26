package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite()
		public void m1(){
			System.out.println("Brfore Suite");
		}
	@AfterSuite
	public void m2(){
		System.out.println("Afetr Suite");
	}
	
	@BeforeClass
	public void m3(){
		System.out.println("Brfore Class");
	}
	
	@AfterClass
	public void m4(){
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void m5(){
		System.out.println("Brfore Method");
	}
	@AfterMethod
	public void m6(){
		System.out.println("After Method");
	}
	
	@BeforeTest
	public void m7(){
		System.out.println("Brfore Test");
	}
	
	@AfterTest
	public void m8(){
		System.out.println("After Test");
	}
	
	@Test
	public void m9(){
		System.out.println("TEST");
	}
	
	@BeforeGroups
	public void m10(){
		System.out.println("Brfore Group");
	}
	@AfterGroups
	public void m11(){
		System.out.println("After Group");
	}
	
	
	

}
