package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BaseClass {

	WebDriver driver;
	WebDriverWait wait2;

	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;

	
	public LoginPage(WebDriver driver) throws IOException
	{
		this.driver = driver;
		//  wait2 = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, this);
	}

	public void intialLogin()
	{ 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		username.sendKeys(prop.getProperty("username"));

		password.sendKeys(prop.getProperty("password"));

		loginbutton.click();
	}


	public boolean getUrl()
	{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String url = driver.getCurrentUrl();

		System.out.println(url);

		if (url.contains("dashboard")) 
		{
			return false;
		} 
		else 
		{
			return true;
		}
	}

}

