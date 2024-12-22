package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extendlisteners.Listeners;



public class LoginTest extends Listeners {
	
	@Test(priority = 1)
	public void loginToApp() throws InterruptedException
	{	
		
		lp2.intialLogin();
		test.info("creadentials entered");
		

		
	}
	 
	
	@Test(priority = 2)
	public void verifyUrl()
	{
		Boolean valuereturned = lp2.getUrl();
		
		Assert.assertFalse(valuereturned, "Test case failed");
	}

}