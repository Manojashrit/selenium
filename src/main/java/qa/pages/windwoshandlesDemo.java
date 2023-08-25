package qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windwoshandlesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);	    
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
	    Set <String> wh =	driver.getWindowHandles();
	    Iterator<String> it  = wh.iterator();
	    String pw = it.next();
	    String cw = it.next();                 
	    driver.switchTo().window(cw);
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    driver.findElement(By.cssSelector(".im-para.red")).getText();
	    
	}

}
