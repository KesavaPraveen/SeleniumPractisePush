package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	private WebDriver driver;
	public WebDriver launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		else
		{
			System.out.println("Please enter the correct browser name.......");
		}
		return driver;
	}
	
	public void enterURL(String url)
	{
		if(url.contains("http") || url.contains("https"))
		{
		driver.get(url);
		}
		else
		{
			System.out.println("Enter the full URL with either HTTP or HTTPS....");
		}
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}

}
