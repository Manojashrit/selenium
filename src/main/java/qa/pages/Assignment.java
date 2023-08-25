package qa.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
		
       ChromeOptions o = new ChromeOptions();
       o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Manoj");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Manoj@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		
		 
		
		Select drpdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		drpdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01/01/1998");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.quit();
		
	Alert alert =	driver.switchTo().alert();
	
	alert.accept();
	
	
		
		
		
		
		
		
		
		

	}

}
