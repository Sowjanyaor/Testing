package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Genericmethod {
	WebDriver driver;
	String baseUrl;
	GenericMethodsdemo gm;
	
	

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		 baseUrl ="https://letskodeit.teachable.com/p/practice";
		 gm = new GenericMethodsdemo(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		
		WebElement signIn = driver.findElement(By.xpath("//a[@href='/sign_up']"));
		signIn.click();
				
		WebElement userName = gm.waitForElement(By.id("user_name"), 3);
		userName.sendKeys("Username");	
		
	}

}
