package POMTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Page.BaseTest;

public class ReadingDates 

{
	
	public String currentDate()
	
	{
		
		SimpleDateFormat format = new SimpleDateFormat("dd");
		
		Date dateReference = new Date();
		
		String day = format.format(dateReference);
		System.out.println("current date"+day);
		
		return day;
		
		
	}
	
	@Test
	public void readDate()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\workspace\\Page\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			//driver.navigate().to("www.fb.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/label/p[1]/span[1]")).click();
		
		for(int i=1;i<30;i++)
		{
		String date= driver.findElement(By.xpath("(//*[@class='DayPicker-Month']//p[1])["+i+"]")).getText();
		
		
		if(date.equals(currentDate()))
		{
			Assert.assertTrue(true);
	break;
		}
		
		System.out.println(date);
		}
		
	
	}
	
	
}