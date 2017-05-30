package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HinduCSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.thehindu.com/";
		driver.manage().window().maximize();		
		driver.get( baseURL);
		String x =driver.findElement(By.cssSelector(".navbar.main-menu.clear>#main-menu>.hidden-xs>.active>a")).toString();
		System.out.println(x);
		x=driver.getWindowHandle();
		System.out.println(x);
}
}