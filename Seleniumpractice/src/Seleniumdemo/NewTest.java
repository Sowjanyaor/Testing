package Seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	String baseUrl;

	
  @Test
  public void f() {
	  
	  driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
		System.out.println("Clicked on login");
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		System.out.println("Sending keys to username field");
		driver.findElement(By.id("user_password")).sendKeys("test");
		System.out.println("Sending keys to password field");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clearing the username field");
  }
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
