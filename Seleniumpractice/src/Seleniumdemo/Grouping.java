package Seleniumdemo;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Grouping {
	
	@BeforeClass(alwaysRun=true )
	public void beforeClass() {
		System.out.println("This method runs before class");
	}
	@BeforeMethod(alwaysRun=true )
	public void beforeMethod() {
		System.out.println();
		System.out.println("This method runs before every method");
	}
	
	@Test(groups ={"BMW","Sedan"},priority = 0)
	public void BMW3Series() {
		System.out.println("Running Test - BMW 3 Series");
		Reporter.log("Testing the repoter", true);
		Assert.assertEquals("123", "13");
	}
	@Test(groups ={"BMW","SUV"},priority = 1)
	public void BMWX3() {
		System.out.println("Running Test - BMW X3");
	}
	@Test(groups = {"Audi","Sedan"},priority = 2,enabled = false)
	public void AudiA6() {
		System.out.println("Running Test - Audi A6");
	}
	@Test(groups = {"Honda","Sedan"},priority = 3)
	public void HondaAccord() {
		System.out.println("Running Test - Honda Accord");
	}
	
	@AfterMethod(alwaysRun=true )
	public void afterMethod() {
		System.out.println("This method runs after every method");
	}

	@AfterClass(alwaysRun=true )
	public void afterClass() {
		System.out.println("This method runs after class");
	}

}

