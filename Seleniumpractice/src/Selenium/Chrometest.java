package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrometest {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Java Tutorial\\chromedriver_win32 (2)\\chromedriver.exe");
		
		String basURL = "http://www.google.com";
		
		driver = new ChromeDriver();
		
		driver.get(basURL);
		
	}

}
