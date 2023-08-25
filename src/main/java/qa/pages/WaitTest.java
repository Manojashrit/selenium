package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        o.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(o);
		
		
	    driver.get("https://www.spicejet.com/");
	    System.out.println(driver.getTitle());
	   String w = driver.getWindowHandle();
	   System.out.println(w);
	   driver.quit();
		

	}

}
