package TestNGFeatures;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void loginTest()
	{
		System.out.println("Login Test");
		
	}

	@Test(dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("Home Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registerTest() {
		System.out.println("Register Test");
	}
	
	@Test(invocationCount=3)
	public void paymentTest() {
		System.out.println("Payment Test");
	}
}
