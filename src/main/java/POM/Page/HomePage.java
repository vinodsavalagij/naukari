package POM.Page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import java.util.*;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	

	Actions action=new Actions(driver);
	@FindBy(xpath="/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]") public WebElement MyNaukari;
	
	
	@FindBy(xpath="//*[@id='qsb-keyskill-sugg']") WebElement searchTextBox;
	
	
	@FindBy(xpath="//button[@type='submit']") public WebElement loginbutton;
	
	public boolean isdisplayed(WebElement loginbutton)
	{
	boolean buttonStatus= loginbutton.isDisplayed();
	
	return buttonStatus;
	}
	public void moveToElement(WebElement MyNaukari)
	{
	action.moveToElement(MyNaukari).build().perform();	
	
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[2]/li[5]/a") WebElement logout;
	
	
	// Download resume button
	
	
	@FindBy(xpath="//*[contains(text(),'Downl')]") public WebElement download;
	
	public void clickDownloadResume()
	{
		
		download.click();
	}
	
	
	public void logout()
	{
		
		logout.click();
	}
	
	
	//Update rehsume button
	
	@FindBy(xpath="//input[@id='attachCV']") public WebElement updateResume;
	// updated profile
	
	@FindBy(xpath="//a[text()='UPDATE PROFILE']") WebElement updateProfileButton;
	
	
	@FindBy(xpath="//button[@type='submit'][text()='SEARCH']") WebElement searchButton;
	
	public void clickbutton()
	{
		updateProfileButton.click();
		
	}
	
	@FindBy(xpath="//a[text()='Update']") WebElement update;
	
	@FindBy(xpath="//*[@id='acord']/div[2]/a[1]") public WebElement accenture;
	
	public void clickupdate()
	{
		
		update.click();
	}
	
	
	
	
	public void enterSkill(String skill)
	
	{
		
		searchTextBox.sendKeys(skill);
	}
	
	public void clickSearch()
	
	{
		
		searchButton.click();
	}

}
