package POMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.Page.BaseTest;
import POM.Page.HomePage;
import POM.Page.LogInPage;
import junit.framework.Assert;


import java.io.File;
import java.io.FileFilter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.apache.commons.*;

public class DownloadResume extends BaseTest
{
	
	public boolean isDownloaded(String path,String filename)
	{
		
		File dir = new File (path);
		
		File[] filesIndir= dir.listFiles();
		
		int totalFiles=filesIndir.length;
		
		for(int i=0;i<totalFiles;i++)
		{
			String fileName=filesIndir[i].getName();
			  
			if(fileName.equalsIgnoreCase(filename))
			return true;
		}
		
		return false;
	}
	
	
	
	
	@Test
	
	public void downloadResume() throws InterruptedException
	
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LogInPage l =new LogInPage(driver);
		
		l.setUserName("vinodsavalagij@gmail.com");
		l.setPassword("9901464350");
		
		l.login();
		
		Thread.sleep(1000);
		
		HomePage p = new HomePage(driver);
		
		p.clickbutton();
		Thread.sleep(1000);
		p.clickupdate();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(p.download));
		
		p.clickDownloadResume();
		
		Thread.sleep(10000);
		
		Assert.assertTrue(isDownloaded("C:\\Users\\vinod\\Downloads","Resume (22).docx"));
	}

}
