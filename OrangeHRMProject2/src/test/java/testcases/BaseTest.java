package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoardPage;
import pages.LoginPage;

public class BaseTest {
	public static WebDriver driver;
	public LoginPage lp2;
	public DashBoardPage db2;
	
	@BeforeSuite
	public void initBrowser() {
		
	//	System.setProperty("webdriver.chrome.driver","D:\\Om_Drive\\Learning Folder\\Eclips\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		// Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();

//        // Add the 'start-maximized' argument to ChromeOptions
//        options.addArguments("--start-maximized");
//        
//        // Add arguments for Incognito and Headless modes
//        options.addArguments("--incognito");
//        
//        options.addArguments("--headless");
        

        // Initialize WebDriver with ChromeOptions
        driver = new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
	@BeforeClass
	public void createObject() throws IOException
	{
		 lp2 = new LoginPage(driver);
		 db2 = new DashBoardPage(driver);
		 
	}
	
	

}