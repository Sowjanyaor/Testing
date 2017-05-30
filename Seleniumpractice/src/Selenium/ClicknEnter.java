package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClicknEnter {
	
	WebDriver driver;
	String baseUrl;
	
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver","D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl ="http://www.gmail.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);		
	}
	
	
	
	

	@Test
	public void test() {
		
		driver.get(baseUrl);
		//driver.findElement(By.cssSelector(".gmail-nav.nav-link gmail-nav.nav-link__sign-in")).click();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("sowjanyaorugnti@gmail.com");
		driver.findElement(By.id("next")).click();;
		
		
		
	}
	
	
@After
	
	public void After() throws InterruptedException  {
	
	
	driver.quit();
		
	}
	
	
	

}
