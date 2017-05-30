package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {
	
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice/?_ga=1.101698761.930221754.1492753887";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	
		Thread.sleep(1000);
		driver.quit();
	}
	
	

	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrl);
		
		Select sel =new Select(driver.findElement(By.id("carselect")));
		
		sel.selectByValue("bmw");
		Thread.sleep(1000);
		
		sel.selectByIndex(2);
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Benz");
		Thread.sleep(1000);
		
		
	}

}
