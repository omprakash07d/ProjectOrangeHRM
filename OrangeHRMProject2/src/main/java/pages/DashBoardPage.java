package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/div/div/input") 
	private WebElement searchfield;
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchShares()
	{

		
		searchfield.sendKeys("Admin");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
	}

}