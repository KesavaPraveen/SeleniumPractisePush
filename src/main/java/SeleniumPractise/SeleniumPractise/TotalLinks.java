package SeleniumPractise.SeleniumPractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By footer= By.xpath("//div[text()='Get to Know Us']/parent::div//a");
//		List<String> footertext=printElementText(footer);
//		System.out.println(footertext);
		List<String> hrefattval=printAttributeVal(footer, "href");
		System.out.println(hrefattval);
//		String hrefval= e.getAttribute("href");
//		System.out.println("HREF Attribute:  " +hrefval);
		
		
		
	}

	public static List<String> printElementText(By locator)
	{
		List<WebElement> footerlist=driver.findElements(locator);
		List<String> footertextlist= new ArrayList<String>();
		for(WebElement e: footerlist)
		{
			String text=e.getText();
			footertextlist.add(text);
		}
		return footertextlist;
	}
	
	public static List<String> printAttributeVal(By locator, String attVal)
	{
		List<WebElement> footerlist=driver.findElements(locator);
		List<String> footerattributetlist= new ArrayList<String>();
		for(WebElement e: footerlist)
		{
			String attributeval=e.getAttribute(attVal);
			footerattributetlist.add(attributeval);
		}
		return footerattributetlist;
	}
	
}
