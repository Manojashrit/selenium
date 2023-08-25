package qa.pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class greenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	}

}
