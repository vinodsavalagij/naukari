package POM.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import extentReports.ExtentReportsDemo;

public  class BasePage extends ExtentReportsDemo

{
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		wait =new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void verifyTitle(String eTitle)
	{
		try
		{
			wait.until(ExpectedConditions.titleContains("hhjj"));
			Reporter.log("Title is true",true);
			
		}
		catch(Exception e)
		{
		}
	}

}
