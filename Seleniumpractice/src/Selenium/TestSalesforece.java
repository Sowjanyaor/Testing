package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSalesforece {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Java Tutorial\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://suite.swiftdigital.com.au/login";	
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		WebElement e =driver.findElement(By.xpath("//div[@id='usernamelogin']//input[contains(@id,'pl_login_user')]"));
		//driver.findElement(By.xpath(".//*[@id='gs_htif0']")).click();
		JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
		myExecutor.executeScript("arguments[0].value='Kirtesh';", e);
		
		
		
	}

}
