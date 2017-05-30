package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkedinbyname {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://www.linkedin.com/";
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.findElement(By.name("session_key")).sendKeys("sowjanyaoruganti@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("krishna99*");	
		driver.findElement(By.id("login-submit")).click();;
		
	}
	
}
