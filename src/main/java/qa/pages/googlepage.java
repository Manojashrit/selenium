package qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googlepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	    driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Capgemini b"); 
	//  List<WebElement> list = driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
	    
	    

	}

}
