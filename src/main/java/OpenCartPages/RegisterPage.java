package OpenCartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumPractise.SeleniumPractise.ElementUtil;

public class RegisterPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	private By firstName= By.name("firstname");
	private By lastName= By.id("input-lastname");
	private By emailId= By.xpath("//input[@id='input-email']");
	private By telePhone= By.cssSelector("input#input-telephone");
	private By password= By.cssSelector("input#input-password.form-control");
	private By confirmPassword= By.id("input-confirm");
	private By yesSub= By.cssSelector("label.radio-inline input[value='1']");
	private By noSub= By.cssSelector("label.radio-inline input[value='0']");
	private By agreeCheckBox= By.name("agree");
	private By agreeBtn= By.xpath("//input[@type='submit' and @value='Continue']");
	private By successMsg=By.cssSelector("div#content h1");
	
	public Boolean userRegister(String firstName,String lastName,String emailId,
						String telePhone,String password,String confirmPassword,
						String Sub) 
	{
		eleUtil.doSendKeys(this.firstName, firstName);
		eleUtil.doSendKeys(this.lastName, lastName);
		eleUtil.doSendKeys(this.emailId, emailId);
		eleUtil.doSendKeys(this.telePhone, telePhone);
		eleUtil.doSendKeys(this.password, password);
		eleUtil.doSendKeys(this.confirmPassword, confirmPassword);
		if(Sub.equalsIgnoreCase("yes"))
		{
			eleUtil.doClick(yesSub);
		}
		else
		{
			eleUtil.doClick(noSub);
		}
		eleUtil.doClick(agreeCheckBox);
		eleUtil.doClick(agreeBtn);
		if(eleUtil.doGetText(successMsg).contains("Created"))
		{
			return true;
		}
		return false;
	}
	
	public String getPageTitle() {
		String pageTitle=eleUtil.getPageTitle();
		return pageTitle;
	}
}
