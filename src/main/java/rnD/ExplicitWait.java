package rnD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ExpectedExceptions;

public class ExplicitWait {
	
	@Test
	public void Waits() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\workspace\\Page\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver"/*dfgfdg*/);
		
		//System.out.println(/*fdgdfg*/"sdfsdf");
		
		driver.findElement(By.id("alert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
		driver.findElement(By.xpath("//*[@id='h2']"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id='h2']")),"Selenium Webdriver"));
		
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='enabled']"))));
		
		
		
	}

}
