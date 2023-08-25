package qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignmentWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);
	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		
	    Thread.sleep(9000);
	    
		Set <String> wh =	driver.getWindowHandles();
		Iterator<String> it  = wh.iterator();
		
	    String pw = it.next();
	    String cw = it.next(); 
	    
	    
	    driver.switchTo().window(cw);
	    System.out.println(driver.findElement(By.xpath("//h3")).getText());
	    driver.switchTo().window(pw);
	    System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	    driver.quit();
	    
	   
	  	}

}
