package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass  {
	
	@Test(groups= {"Regression","Master"})
	public void test_Account_Registration()
	{
		logger.info("******* starting TC_001_AccountRegistrationTest *******");

		HomePage hp= new HomePage(driver);
		logger.info("Clicking on MyAccount link");
		hp.clickMyAccount();
		
		logger.info("Clicking on Register link");
        hp.clickRegister();
		
		logger.info("Providing customers details");
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName(randomStrings()); //regpage.setFirstName(randomStrings().toUpperCase());

		regpage.setLastName(randomStrings());
		
		regpage.setEmail(randomStrings()+"@gmail.com");
		regpage.setTelephone(randomNumber());
		
		String pwd=randomAlphaNumeric();//randomAlphaNumeric().toLowerCase());
		                                //randomAlphaNumeric()+"@_");
		regpage.setPassword(pwd);
		regpage.setConfirmPassword(pwd);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
	    String confmsg=regpage.getConfirmationMsg();
	    if(confmsg.equals("Your Account Has Been Created!"))
	    {
			logger.info("Registration successful...");
        	Assert.assertTrue(true);	
	    }
	    
	    else
	    {
			logger.error("Registration failed");
	    	Assert.fail();
	    }
	    
		logger.info("******* Finished TC_001_AccountRegistrationTest *******");

	}	

}
