package testCases;

import org.testng.annotations.Test;

import pageObjects.LogInPageShubham;
import testBase.BaseClass1;


public class LogIn extends BaseClass1 {

	@Test()
	public void test_login() throws InterruptedException
	{

	
		LogInPageShubham lp=new LogInPageShubham(driver);
	lp.setuser();
	lp.setPassword();
	ScrollByjs();
	Thread.sleep(2000);
	lp.clickLogin();

		
	lp.fillform();
		
	}
}