package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class spiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj.Ashrit\\Documents\\Work\\Documents\\ChromeDriver\\chromedriver.exe");
		

       ChromeOptions o = new ChromeOptions();
      o.addArguments("--disable-notifications");
      o.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(o);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'From')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Belagavi Airport')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //*[contains(text(),'Bengaluru')]")).click();
		System.out.println("passed selecting destination");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();
		
		for (int i=1; i<3; i++)
		{
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
		}
		
		for(int i=1; i<3; i++)
		{
		driver.findElement(By.xpath("//div[@id='react-root']//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']//div[2]//div[2]//div[3]")).click();
		}
		
		for(int i=1; i<3; i++)
		{
		driver.findElement(By.xpath("//div[normalize-space()='Currency']")).click();
		}
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
		

		
		
		//driver.quit();

	}

}
