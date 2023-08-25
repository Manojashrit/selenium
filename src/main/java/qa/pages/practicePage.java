package qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]")).click();
		
		for(int i=1; i<3; i++)
		{
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
		}
		for(int i=1; i<3; i++)
		{
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/div/div[1]")).getText());	
		
			
				
		
		
//		  System.out.println(driver.getTitle());
//		  driver.findElement(By.id("inputUsername")).sendKeys(
//		  "manojashrit540@gmail.com");
//		  driver.findElement(By.name("inputPassword")).sendKeys("Password@123");
//		  driver.findElement(By.className("signInBtn")).click(); String errormessage =
//		  driver.findElement(By.cssSelector("p.error")).getText();
//		  System.out.println(errormessage);
//		 
		
	
		//driver.quit();
		
		

	}

}
