package TestNGFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPageTest {
	
	 WebDriver driver;
	 By firstName= By.name("firstname");
	 By lastName= By.id("input-lastname");
	 By emailId= By.xpath("//input[@id='input-email']");
	 By telePhone= By.cssSelector("input#input-telephone");
	 By password= By.cssSelector("input#input-password.form-control");
	 By confirmPassword= By.id("input-confirm");
	 By yesSub= By.cssSelector("label.radio-inline input[value='1']");
	 By noSub= By.cssSelector("label.radio-inline input[value='0']");
	 By agreeCheckBox= By.name("agree");
	 By agreeBtn= By.xpath("//input[@type='submit' and @value='Continue']");
	 By successMsg=By.cssSelector("div#content h1");
	
	@BeforeTest
	public void registerPageSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}
	
	@Test
	public void userRegisterTest() {
		
		driver.findElement(firstName).sendKeys("");
		
	}
	
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

	
}
