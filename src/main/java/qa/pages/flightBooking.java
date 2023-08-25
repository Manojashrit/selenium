package qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  //dynamic dropdown

public class flightBooking {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[contains(text(),'From')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Belagavi Airport')]")).click(); 
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //*[contains(text(),'Bengaluru')]")).click();
		
	}

}
