package qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class svgElement {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//ChromeOptions o = new ChromeOptions();
     //   o.addArguments("--disable-notifications");
      //  o.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.findElement(By.xpath("//label[contains(text(),'Can you enter name here through automation')]//*[@iconid='editon']")).click();
	    Thread.sleep(1500);
		//driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("manoj");
			
		
		driver.findElement(By.xpath("//input[@placeholder='First Enter name']")).sendKeys("Manoj");
		//driver.quit();


	}

}
