package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class radioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
		

        ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(o);
		
	//	driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Family & Friends')]")).isSelected());
		driver.findElement(By.xpath("//*[contains(text(),'Family & Friends')]")).click();
		Thread.sleep(6000);
		System.out.println("Clicked");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Family & Friends')]")).isSelected());
        driver.quit();
	}

}
