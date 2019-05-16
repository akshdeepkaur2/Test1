//Akshdeep kaur
//student Id - C0738118
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DestinationTest1 {

	
	final String URL = "http://www.blazedemo.com";
	final String DRIVER_PATH = "/Users/akshdeepkaur/Desktop/chromedriver";
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		// Setup Selenium + Chrome
		System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
		driver = new ChromeDriver();
		
		// Tell Selenium what page to test
		driver.get(URL);
				
	}

	@After
	public void tearDown() throws Exception {
		// At end of test case, wait for a few seconds, then close the browser
					
		TimeUnit.SECONDS.sleep(1);		
		Driver.close();
		}
		@Test
		public void testDepartureCities() throws InterruptedException  {
			
				/*
				 * PART 1: Press Button
				 * 	-> All the options will be show up
				 * 	
				 * PART 2:select a city
				 * 	-> The city is selected
				 *  ->The city will show up in box
				 */
				
				// PRESS BUTTON:
				// 1. FIND THE BUTTON										(findByElement)
				WebElement button = driver.findElement(By.class("form-line"));
				// 2. CLICK ON THE BUTTON									(.click())
				button.click();
				
				
				}
				
				
				
			
			
			
		}
	
