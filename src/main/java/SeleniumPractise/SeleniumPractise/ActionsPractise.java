package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPractise {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		By searchBar= By.name("q");
		//doActionSendKeys(searchBar,"hello");
		doActionKeyDown(searchBar, "keshav");
		
	}
	
	public static WebElement getElement(By locator) 
	{
		return driver.findElement(locator);
	}
	public static void doActionSendKeys(By locator,String value) {
	
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();;
		
	}
	
	public static void doActionKeyDown(By locator,String value) {
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(getElement(locator), value).perform();
	}

	
	}

