package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class makemytripDemo {
	
	ChromeOptions o = new ChromeOptions();
//    o.addArguments("--disable-notifications");
  //  o.addArguments("--remote-allow-origins=*");
   // WebDriver driver = new ChromeDriver(o);

		
	@FindBy(xpath="//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	WebElement From ;
	
	@FindBy(css="li[id='react-autowhatever-1-section-0-item-0'] p[class='font14 appendBottom5 blackText']")
	WebElement SelectCity ;
	
	@FindBy(xpath="//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	WebElement To ;
	
	@FindBy(xpath="//span[normalize-space()='Departure']")
	WebElement DepartureDate ;
	
	@FindBy(xpath="//span[normalize-space()='Departure']")
	WebElement Departuredate ;
	
	@FindBy(xpath="//span[@class='lbl_input appendBottom5']")
	WebElement ClickTravellersAndClass ;
	
	By selectAdults = By.cssSelector("li[data-cy='adults-2']");
	
	By selectChildren = By.cssSelector("li[data-cy='children-1']");
	
	@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement search ;
	
	
	
	/*
	 * public makemytripDemo(WebDriver driver) { this.driver=driver; }
	 * 
	 * public void navigateMakemyTrip() { From.click();
	 * driver.findElement(selectAdults). }
	 */
	
	
	
}
