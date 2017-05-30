package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linktextdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.flipkart.com";
		driver.manage().window().maximize();		
		driver.get(baseURL);
		//driver.findElement(By.linkText("Gift Card")).click();
		//driver.findElement(By.partialLinkText("Customer Care")).click();
		Thread.sleep(2000);
	driver.findElement(By.className("LM6RPg")).sendKeys("earrings");;
	
		
	}
	
	
}
