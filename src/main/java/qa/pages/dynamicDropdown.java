package qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(5000);
		
	List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
			
	
	for(WebElement option : options )
	{
	     if(option.getText().equalsIgnoreCase("India"))		
	    {
		option.click();
		break;
	    }
	
	     
	}
		driver.quit();
		
		
		
		

	}

}
