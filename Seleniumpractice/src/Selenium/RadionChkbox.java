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

public class RadionChkbox {
	
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
		
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		Thread.sleep(1000);
		
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		benzRadio.click();
		Thread.sleep(1000);
		
		WebElement hondaChk = driver.findElement(By.id("hondacheck"));
		hondaChk.click();
		Thread.sleep(1000);
		
		WebElement benzChk = driver.findElement(By.id("benzcheck"));
		benzChk.click();
		benzChk.isEnabled();
		Thread.sleep(1000);
		
		
		List<WebElement> e1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = e1.size();
		
		for(int i=0; i<size;i++){
			
			if(!e1.get(i).isSelected()){
				e1.get(i).click();
			}
			
		}
		
		
		
		
	}

}
