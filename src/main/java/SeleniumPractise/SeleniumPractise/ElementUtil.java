package SeleniumPractise.SeleniumPractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public  By getBy(String locatortype,String locatorvalue)
	{
		By locator=null;
		switch(locatortype.toLowerCase()) 
		{
		
		case "id":
			locator = By.id(locatorvalue);
			break;
		case "name":
			locator= By.name(locatorvalue);
			break;
		case "classname":
			locator= By.className(locatorvalue);
			break;
		case "linktext":
			locator= By.linkText(locatorvalue);
			break;
		case "partiallinktext":
			locator= By.partialLinkText(locatorvalue);
			break;
		case "xpath":
			locator= By.xpath(locatorvalue);
			break;
		case "cssselector":
			locator= By.cssSelector(locatorvalue);
			break;
		case "tagname":
			locator= By.tagName(locatorvalue);
			break;
		
		default:
			break;
		}
		return locator;
	}
	
	public  WebElement getElement(By locator)
	{
		 return driver.findElement(locator);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String doGetText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public  void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}

	
	public  void doSendKeys(String locatortype,String locatorvalue,String value)
	{
		getElement(getBy(locatortype, locatorvalue)).sendKeys(value);
	}

	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public void doClick(String locatortype,String locatorvalue)
	{
		getElement(getBy(locatortype, locatorvalue)).click();
	}
	
	
	public  List<String> printElementTextList(By locator)
	{
		List<WebElement> elelist=driver.findElements(locator);
		List<String> eletextlist= new ArrayList<String>();
		for(WebElement e: elelist)
		{
			String text=e.getText();
			eletextlist.add(text);
		}
		return eletextlist;
	}
	
	public  List<String> printAttributeValList(By locator, String attVal)
	{
		List<WebElement> elelist=driver.findElements(locator);
		List<String> eleattributetlist= new ArrayList<String>();
		for(WebElement e: elelist)
		{
			String attributeval=e.getAttribute(attVal);
			eleattributetlist.add(attributeval);
		}
		return eleattributetlist;
	}
	
	public void selectByIndex(By locator,int index)
	{
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void selectByValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void selectByVisibleText(By locator,String text)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void doActionSendKeys(By locator,String value) {
		
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();;
		
	}
	
	public void doActionKeyDown(By locator,String value) {
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(getElement(locator), value).perform();
	}
	
	public WebElement waitForElementVisible(By locator, int timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitForAlertWindow(int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public String doGetAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	public void doAlertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void doAlertReject() {
		driver.switchTo().alert().dismiss();
	}
	
	
}
