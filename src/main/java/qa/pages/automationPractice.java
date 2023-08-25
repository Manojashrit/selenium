package qa.pages;

import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class automationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("name")).sendKeys("manoj"); 
	    driver.findElement(By.id("alertbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    driver.findElement(By.id("confirmbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
	    
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(6000);
	    
	 //   js.executeScript("document.querySelector('.tableFixHead').scrollTop=7000");
	    
	  List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	  
	  int sum = 0;
	  
	  for(int i=0; i<=values.size(); i++)
	  {
		 sum = sum + Integer.parseInt(values.get(i).getText());
		 System.out.println(sum);
		 
	  }
	  System.out.println(sum);
	    driver.quit();


	    
	    
	    
	}

}
