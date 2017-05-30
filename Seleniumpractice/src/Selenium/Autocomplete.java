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

public class Autocomplete {
	
	WebDriver driver;
	String baseUrl;
	String partialText;
	String text;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Java Tutorial\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.makemytrip.com/";
		text ="Hyderabad (HYD)";
		partialText="Hy";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
//*[@id='ui-id-3']//p/span[@class="autoCompleteItem__label"],  Hyderabad, India
	@Test
	public void test() {
		
		driver.get(baseUrl);
		
		driver.findElement(By.id("hp-widget__sfrom")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-3']//p/span[1]"));
		
		
		for(WebElement con : list){
			System.out.println(con.getText());
			if(con.getText().contains("Mum")){
				con.click();
				
			}
		}
		
		
	}

}
