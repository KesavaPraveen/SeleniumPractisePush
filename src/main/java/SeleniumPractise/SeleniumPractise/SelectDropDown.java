package SeleniumPractise.SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(5000);
		//By cntrydropdown=By.name("Country");
		//Select select=new Select(cntrydropdown);
		//select.selectByIndex(5);
		//select.selectByValue("India");
		//select.selectByVisibleText("Dominica");
//		selectByIndex(cntrydropdown, 9);
//		Thread.sleep(2000);
//		selectByValue(cntrydropdown,"Brazil");
//		Thread.sleep(2000);
//		selectByVisibleText(cntrydropdown, "India");
		WebElement dropdown=driver.findElement(By.name("Country"));
		Select select=new Select(dropdown);
		List<WebElement> alloptions=select.getAllSelectedOptions();
		for(WebElement e: alloptions)
		{
			String text=e.getText();
			System.out.println(text);
			
		}
	}
	
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//	}
//	
//	public static void selectByIndex(By locator,int index)
//	{
//		Select select=new Select(getElement(locator));
//		select.selectByIndex(index);
//	}
//	
//	public static void selectByValue(By locator,String value)
//	{
//		Select select=new Select(getElement(locator));
//		select.selectByValue(value);
//	}
//	
//	public static void selectByVisibleText(By locator,String text)
//	{
//		Select select=new Select(getElement(locator));
//		select.selectByVisibleText(text);
//	}

}
