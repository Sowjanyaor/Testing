package Sample;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	public static WebElement element = null;
	static Logger log = LogManager.getLogger(SearchPage.class.getName());
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		log.info("Origin text box element found");
		return element;
	}
	
	/**
	 * Fill origin city in origin text box
	 * @param driver
	 * @param origin
	 */
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='"+origin+"'", element);
		log.info("Enter origin city as " + origin);
	}

	/**
	 * Returns the flight destination text box element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		log.info("Destination text box element found");
		return element;
	}
	
	/**
	 * Fill destination city in destination text box
	 * @param driver
	 * @param origin
	 */
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='"+destination+"'", element);
		log.info("Enter destination city as " + destination);
	}

	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		return element;
	}
	
	/**
	 * Fill departure date in departure date text box
	 * @param driver
	 * @param date
	 */
	public static void fillDepartureDateTextBox(WebDriver driver, String date) {
		element = departureDateTextBox(driver);
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='"+date+"'", element);
		log.info("Enter departure date as " + date);
	}

	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		return element;
	}
	
	/**
	 * Fill return date in return date text box
	 * @param driver
	 * @param date
	 */
	public static void fillReturnDateTextBox(WebDriver driver, String date) {
		element = returnDateTextBox(driver);
		element.clear();
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='"+date+"'", element);
		log.info("Enter return date as " + date);
	}

	/**
	 * Returns the search button box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("[@type='submit']"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("header-account-menu")).click();
		element = driver.findElement(By.id("tab-flight-tab-hp"));
		element.click();
		log.info("Navigate to flights tab");
	}
	/**
	 * Click on Advanced Options link
	 * @param driver
	 */
	public static void clickOnAdvancedLink(WebDriver driver) {
		element = driver.findElement(By.id("flight-advanced-options-hp-flight"));
		element.click();
		log.info("Clicked on Advanced Options link");
	}
	/**
	 * Click non-stop check box
	 * @param driver
	 */
	public static void clickNonStopCheckBox(WebDriver driver) {
		element = driver.findElement(By.id("advanced-flight-nonstop"));
		element.click();
		log.info("Clicked non-stop check box");
	}
	/**
	 * Select flight class
	 * @param driver
	 */
	public static void selectFlightClass(WebDriver driver, String flightClass) {
		Select options = new Select(driver.findElement(By.id("flight-advanced-preferred-class-hp-flight")));
		options.selectByValue(flightClass);
		log.info("Select flight class as " + flightClass);
	}
}
