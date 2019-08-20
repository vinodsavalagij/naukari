package POMTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import POM.Page.BaseTest;
import POM.Page.HomePage;
import POM.Page.LogInPage;

public class ValidLogIn extends BaseTest 

{
	
<<<<<<< HEAD
asfdfd	@Test
=======
	@Test//vinod
>>>>>>> branch 'master' of https://github.com/vinodsavalagij/naukari.git
	public void testValidLogin() throws InterruptedException
	{
		//naveen bmvhkvhk
	//	ExtentTest logger=extent.createTest("LoginTest");
		
		//logger.info("start login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	logger.info("implicitly wait passed");
		LogInPage l=new LogInPage(driver);
		
		l.setUserName("vinodsavalagij@gmail.com");
		l.setPassword("9901464350");
				
l.login();


Assert.assertTrue(true);


	}
}
