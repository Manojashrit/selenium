package qa.pages;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ScreenshotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	
		        // Set the path to the WebDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/driver/executable");

		        // Create a new instance of the browser driver
		        WebDriver driver = new ChromeDriver();

		        // Open flipkart.com
		        driver.get("https://www.flipkart.com");

		        // Take a screenshot
		        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		        // Specify the location where you want to save the screenshot
		        String screenshotPath = "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\api\\screenshot.png";

		      

		        // Close the browser
		        driver.quit();
		    }
		}


	

