package qa.pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reportertesting {
	
	ExtentReports extent =  new ExtentReports();
	
	@BeforeTest
	public void config()
	{
		
		String path = System.getProperty("user.dir") + "//reports//index.html";
		ExtentSparkReporter reporter =  new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Web Automation report");
		reporter.config().setReportName("Test Report");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Manoj");
		
		
	}
	
	@Test
	public void TestCase1()
	{
		extent.createTest("Test execution");
		
		ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);
	    
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	     int j =0;
		
		    String[] names = {"Cucumber", "Beetroot"};
		
	       List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
	    
	    for(int i=0; i<productNames.size(); i++)
	    {
	    	String[] text = productNames.get(i).getText().split("-");	
	    	         String Formanttext = text[0].trim();
	    	System.out.println(Formanttext);
	    	
	    	   List<String> list = Arrays.asList(names);
	    	
	    	if(list.contains(Formanttext))
	    	{
	    	  j++;
	    	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	    	System.out.println("clicked");
	    	if(j==3)
	    	{
	    		break;
	    	}
	    	
	    	}
	    	
	    }
     driver.quit();
	
		
		extent.flush();
		
		
	}
	
	
	

}
