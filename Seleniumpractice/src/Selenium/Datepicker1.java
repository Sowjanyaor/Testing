package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker1 {
	
	
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com.au/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}

	@Test
	public void test() {
		
	driver.get(baseUrl);
	
	
	driver.findElement(By.id("tab-car-tab-hp")).click();;
	driver.findElement(By.id("car-pickup-date-hp-car")).click();
	
	WebElement cal = driver.findElement(By.xpath(".//div[@class='datepicker-cal-month'][1]"));
	
	List<WebElement> availDates = cal.findElements(By.xpath(".//button[@data-year]"));
	
	for(WebElement date: availDates){
		
		if(date.getText().equals("30")){
			
			date.click();
			
		}
	
	
	
		
	
	}

}
}
