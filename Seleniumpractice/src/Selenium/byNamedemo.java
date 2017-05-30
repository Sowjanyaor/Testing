package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class byNamedemo {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	String baseURL ="http://www.google.com";
	driver.manage().window().maximize();
	driver.get(baseURL);
	
	driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
	driver.findElement(By.name("btnK")).click();
	driver.quit();
	}
}
