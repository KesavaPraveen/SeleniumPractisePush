package SeleniumPractise.SeleniumPractise;


import org.openqa.selenium.WebDriver;


public class BrowserIncovation {

	static WebDriver driver;
	public static void main(String[] args) {

//		String browser="EdGe";
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
//			driver =new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			System.setProperty("webdriver.edge.driver","D:\\Drivers\\msedgedriver.exe");
//			driver =new EdgeDriver();
//		}
//		else
//		{
//			System.out.println("Please enter the correct browser name.......");
//		}
		
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		String pageTitle=driver.getTitle();
		System.out.println("Page Title:  "+pageTitle);
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page URL:  "+pageUrl);
		String pageSource=driver.getPageSource();
		System.out.println("Page Source:  "+pageSource);
		driver.quit();
		
	}

}
