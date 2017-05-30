package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void test() {

		driver.get(baseUrl);
		WebElement e1 = driver.findElement(By.id("lst-ib"));
		
		boolean isEnabled=e1.isEnabled();		
		System.out.println(isEnabled);
		
		isEnabled = driver.findElement(By.id("gs_taif0")).isEnabled();
		System.out.println(isEnabled);
	}

	@After
	public void tearDown() throws Exception {

		Thread.sleep(1000);
		driver.quit();

	}

}
