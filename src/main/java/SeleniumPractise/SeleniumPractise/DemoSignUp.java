package SeleniumPractise.SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSignUp {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//		WebElement fname=driver.findElement(By.name("firstname"));
//		fname.sendKeys("Test Automation");
//		WebElement lname=driver.findElement(By.name("lastname"));
//		lname.sendKeys("Practise");
//		WebElement gendermale=driver.findElement(By.xpath("//*[@id='sex-0']"));
//		gendermale.click();
//		String val=gendermale.getAttribute("value");
//		if(gendermale.isSelected())
//		{
//			System.out.println("Gender  :" +val);
//		}
//		String text=driver.findElement(By.xpath("//*[text()='Years of Experience']")).getText();
//		System.out.println(text);
		
		List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[3]/div[1]/div[2]/ul/li/a"));
		System.out.println(links.size());
		for(WebElement e: links)
		{
			String hrefvalues=e.getAttribute("href");
			String linkstext=e.getText();
			
			System.out.println("Links text:   " +linkstext+  "  HREF Values:   " +hrefvalues);
		}
		
		
		
		
	}

}
