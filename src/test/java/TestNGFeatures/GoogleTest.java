package TestNGFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}

	
	@Test(priority=1)
	public void titleTest()
	{
		Assert.assertEquals(driver.getTitle(),"Google");
	}
	
	@Test(priority=3)
	public void privacyLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Privacy")).isDisplayed());
		
	}
	
	@Test(priority=2)
	public void searchTest() {
		driver.findElement(By.name("q")).sendKeys("Selenium Learning");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
