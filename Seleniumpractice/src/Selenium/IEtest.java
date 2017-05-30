package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEtest {
public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "D:\\Java Tutorial\\IEDriverServer.exe");
		
		String basURL = "http://www.google.com";
		
		driver = new InternetExplorerDriver();
		
		driver.get(basURL);
		
	}

}
