package POMTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import POM.Page.BasePage;
import POM.Page.BaseTest;
import POM.Page.HomePage;
import POM.Page.LogInPage;

public class UpdateProfile extends BaseTest {

	
	@Test
	public void testValidLogin() throws InterruptedException, IOException
	{
		
//ExtentTest logger=extent.createTest("update profile");
		
		//logger.info("start update profile");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LogInPage l=new LogInPage(driver);
		l.setUserName("vinodsavalagij@gmail.com");
		l.setPassword("9901464350");
				
l.login();

HomePage hp=new HomePage(driver);

hp.clickbutton();
Thread.sleep(5000);
hp.clickupdate();

WebDriverWait wait =new WebDriverWait(driver,30);

WebElement deletResume = driver.findElement(By.xpath("//a[text()='DELETE RESUME']"));

wait.until(ExpectedConditions.visibilityOf(deletResume));

Actions actions = new Actions(driver);

actions.moveToElement(hp.updateResume).click().build().perform();

Thread.sleep(5000);


JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", hp.updateResume);


Runtime.getRuntime().exec("C:\\Users\\vinod\\Desktop\\resumeUpdate1.exe");


Thread.sleep(2000);

}}
