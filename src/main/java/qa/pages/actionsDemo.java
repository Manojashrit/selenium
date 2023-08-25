package qa.pages;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;





public class actionsDemo 

{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
			
		ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);
	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//span[@class='nav-line-2']"))).contextClick().build().perform();
		Thread.sleep(4000);
		a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).contextClick().build().perform();
		Thread.sleep(4000);
		
	
		
		
		
		
	
	
	   
		
		
		
		

	
	
	


		
		
	}

}
