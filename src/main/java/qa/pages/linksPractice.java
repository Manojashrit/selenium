package qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linksPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);
	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footdriver =  driver.findElement(By.id("gf-BIG"));
	System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		
	    WebElement ColoumnDriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(ColoumnDriver.findElements(By.tagName("a")).size());              
		 
		for(int i=1; i<ColoumnDriver.findElements(By.tagName("a")).size(); i++)
		{
	        String   clickOnTab	=	Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			ColoumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			Thread.sleep(2000);
			
	        
		}
		{
			Set<String>	windows =	driver.getWindowHandles();
	        Iterator<String> it = windows.iterator();
	        while(it.hasNext())
	        {
	        	driver.switchTo().window(it.next());
	        	System.out.println(driver.getTitle());
	        	
	        }
	        driver.quit();
	        
	        
		}
	
	}

}
