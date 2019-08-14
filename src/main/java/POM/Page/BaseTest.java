package POM.Page;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class BaseTest implements Autoconst
{
	
	public WebDriver driver;
	
	ExtentHtmlReporter reporter;
	//public ExtentReports extent;
	//extent.attachReporter(reporter);
	
	
	@BeforeMethod
public void test()
{
System.out.println("viod");	

//DesiredCapabilities capacbilities = DesiredCapabilities.chrome();
//We options= new ChromeOptions();
//options.addArguments("--incognito");
//capacbilities.setCapability(ChromeOptions.CAPABILITY,options);

System.setProperty(KEY, VALUE);
	driver=new ChromeDriver();
	
	driver.get(URL);

	//reporter = new ExtentHtmlReporter("E:\\eclipse\\file.html");
	//extent = new ExtentReports();
	//extent.attachReporter(reporter);
}
	
@AfterMethod
	public void closeBrowser() throws IOException
	{
		
	//extent.flush();
		
		/*//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//String s = RandomStringUtils.randomAlphabetic(8); 
		//FileUtils.copyFile(src, new File("C:\\Users\\vinod\\Desktop\\screenshot\\"+s+".jpg"));
*/		driver.close();
	}
}