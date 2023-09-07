package testCases;

import org.testng.annotations.Test;

import testBase.BaseClass;
import utilities.DataProviders;

public class TC_004_AddToCart extends BaseClass {
	
	
	@Test(priority=1, groups= {"sanity"}, dependsOnMethods= {"logIn"}, 
		 dataProvider="dp", dataProviderClass=DataProviders.class)
	
	public void setData()
	{
		logger.info("entered username");
	}

}
