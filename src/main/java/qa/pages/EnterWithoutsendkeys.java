package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnterWithoutsendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("----disable-notifications--");
		o.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(o);
		 
	   driver.get("https://www.google.com/");;
	   WebElement	searchbox = driver.findElement(By.id("APjFqb"));
	
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].value='selenium'", searchbox);
	   searchbox.submit();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
	   
		
		

	}

}
