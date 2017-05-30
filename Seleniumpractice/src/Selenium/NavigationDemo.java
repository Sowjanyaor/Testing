package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationDemo {
	WebDriver driver;
	String baseUrl;
	String currentUrl;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver","D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl ="http://letskodeit.teachable.com/";
		currentUrl="https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);	
		
	}

	@After
	public void tearDown() throws Exception {
		
	driver.quit();
		
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.navigate().to(currentUrl);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
	
		Thread.sleep(2000);
				
	}

}
