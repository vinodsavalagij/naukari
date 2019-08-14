package POMTest;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import POM.Page.BaseTest;
import POM.Page.HomePage;
import POM.Page.LogInPage;
import junit.framework.Assert;

public class VerifySearch extends BaseTest

{
	@Test
	public void searchJob() throws InterruptedException
	
	{

//ExtentTest logger1=extent.createTest("verify search");
		
//logger1.info("start verify");


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LogInPage logino =new LogInPage(driver);
		logino.setUserName("vinodsavalagij@gmail.com");
		logino.setPassword("9901464350");
	
	logino.login();
	
	
	HomePage hp=new HomePage(driver);
	
	hp.enterSkill("Selenium");
	
	
	hp.clickSearch();
	
	//hp.accenture.click();
	
	//System.out.println(hp.accenture.getAttribute("title"));
	Thread.sleep(5000);
	
	/*WebDriverWait wait = new WebDriverWait(driver,30);
	
	wait.until(ExpectedConditions.alertIsPresent());
	
	driver.switchTo().alert().dismiss();
	*/
	
	SoftAssert asert =new SoftAssert();
	
	List<WebElement> searchDivs = driver.findElements(By.xpath("//span[@class='content']"));
	
	
	for(int i=1;i<=5;i++)
	{
	
	driver.findElement(By.xpath("//*[@id='acord']/div[2]/a["+i+"]")).click();
System.out.println(hp.accenture.getCssValue("font-size"));
	Thread.sleep(5000);
	
	int actual=searchDivs.size();
	
	int expected=550;
	
	
	
	
	asert.assertEquals(actual, expected);
	}
/*for(int i=1;i<5;i++)
	
{

driver.findElement(By.xpath("//*[@id='acord']/div[2]/a[i]")).click();
}*/

	
	
	///Assert.assertFalse(hp.accenture.isSelected());
	
	asert.assertAll();
	
	

	}
	
	}
