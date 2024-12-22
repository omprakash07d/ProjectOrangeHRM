package testcases;

import org.testng.annotations.Test;

import extendlisteners.Listeners;



public class DashBoardTest extends Listeners {
	
	
	@Test(priority = 3)
	public void search()
	{
		db2.searchShares();
		
		test.info("Admin search");
	}

}