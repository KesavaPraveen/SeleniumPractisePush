package TestNGFeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println(" Before Suite ");
	}
	
	@BeforeTest
	public void beforeTes()
	{
		System.out.println(" Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println(" Before Class ");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println(" Before Method");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println(" After Suite ");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println(" After Test");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println(" After Class ");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println(" After Method");
	}
}
