package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStat {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
//		//1
//		driver.findElement(By.id("input-email")).sendKeys("Test123@test.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test123");
		
		//2
//		WebElement email= driver.findElement(By.id("input-email"));
//		WebElement pass = driver.findElement(By.id("input-password"));
//		email.sendKeys("Test123@test.com");
//		pass.sendKeys("Test123");
		
		//3
//		By eid= By.id("input-email");
//		By pwd= By.id("input-password");
//		WebElement email= driver.findElement(eid);
//		WebElement pass = driver.findElement(pwd);
//		email.sendKeys("Test123@test.com");
//		pass.sendKeys("Test123");
		
		//4
//		By eid= By.id("input-email");
//		By pwd= By.id("input-password");		
//		getElement(eid).sendKeys("Test123@test.com");
//		getElement(pwd).sendKeys("Test123");
		
		//5
//		By eid= By.id("input-email");
//		By pwd= By.id("input-password");
//		doSendKeys(eid,"Test123@test.com");
//		doSendKeys(pwd,"Test123");
		
		//6
//		ElementUtil el=new ElementUtil(driver);
//		By eid= By.id("input-email");
//		By pwd= By.id("input-password");
//		el.doSendKeys(eid,"Test123@test.com");
//		el.doSendKeys(pwd,"Test123");
		
		
		//7
		String eid="input-email";
		String pwd="input-password";
		doSendKeys("id",eid,"Test123@test.com");
		doSendKeys("id",pwd,"Test123");
	}
	public static By getBy(String locatortype,String locatorvalue)
	{
		By locator=null;
		switch(locatortype.toLowerCase()) 
		{
		
		case "id":
			locator = By.id(locatorvalue);
			break;
		
		default:
			break;
		}
		return locator;
	}
	public static WebElement getElement(By locator)
	{
		 return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doSendKeys(String locatortype,String locatorvalue,String value)
	{
		getElement(getBy(locatortype, locatorvalue)).sendKeys(value);
	}
	
	
	

}
