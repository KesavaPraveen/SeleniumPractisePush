package SeleniumPractise.SeleniumPractise;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitPractise {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		By alertButton=By.id("alert");
		By displayButton=By.id("display-other-button");
		By enableButton = By.id("hidden");
		By checkBox= By.id("checkbox");
		By checkBoxId= By.id("ch");
		doClick(alertButton);
		waitForAlertWindow(5);
		String alertText=doGetAlertText();
		doAlertAccept();
		System.out.println("Text Displayed after Switching to Alert Window  " +alertText);
		doClick(displayButton);
		if(waitForElementVisible(enableButton, 11).isEnabled())
		{
			System.out.println(doGetText(enableButton));
		}
		else
		{
			System.out.println("The button is still not enabled");
		}
		doClick(checkBox);
		if(waitForElementVisible(checkBoxId, 11).isSelected())
		{
			System.out.println(" The  Check Box is Selected..." +doGetText(checkBoxId));
		}
		else
		{
			System.out.println(" The Check Box is not Selected...");
		}
		
//		driver.findElement(displayButton).click();
//	
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		WebElement enableBtn=wait.until(ExpectedConditions.visibilityOfElementLocated(enableButton));
//		if(enableBtn.isEnabled())
//		{
//			System.out.println(enableBtn.getText());
//		}
//		else
//		{
//			System.out.println("The button is still not enabled");
//		}
//				
		
		
	
	}
	
	public static WebElement getElement(By locator) 
	{
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public static String doGetText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public static WebElement waitForElementVisible(By locator, int timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void waitForAlertWindow(int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static String doGetAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	public static void doAlertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public static void doAlertReject() {
		driver.switchTo().alert().dismiss();
	}
	

}
