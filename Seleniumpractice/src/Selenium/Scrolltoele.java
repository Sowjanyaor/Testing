package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolltoele {
	
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		js= (JavascriptExecutor) driver;
		baseUrl = "https://www.makemytrip.com/";		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}
//[@id='deals_live_deals'
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1900);");

		
		//WebElement element = driver.findElement(By.id("deals_live_deals"));
		//js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

}
