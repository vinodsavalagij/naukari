package POMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.Page.BaseTest;
import POM.Page.HomePage;
import POM.Page.LogInPage;


@Listeners(POM.Page.ListenersInterface.class)
public class LogOut extends BaseTest
<<<<<<< HEAD
{naveen
=======
{vinod // vinod
>>>>>>> branch 'master' of https://github.com/vinodsavalagij/naukari.git
	
	@Test
	public void logout() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LogInPage l=new LogInPage(driver);
		
		Thread.sleep(5000);
		l.setUserName("vinodsavalagij@gmail.com");
		l.setPassword("9901464350");
		l.login();
		HomePage hp=new HomePage(driver);
		
		hp.moveToElement(hp.MyNaukari);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		hp.logout();
		
		boolean status= hp.isdisplayed(hp.loginbutton);
		Assert.assertTrue(status);
		
		

	}
}
