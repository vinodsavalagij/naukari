package extentReports;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class ExtentReportsDemo 

{
	
	@Test
	public void report() throws IOException
	
	{
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("E:\\eclipse\\file.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		 ExtentTest logger=extent.createTest("LoginTest");
		 logger.log(Status.INFO, "Login");
		 
		 logger.log(Status.PASS, "Title verified");
		 
		 extent.flush();
		
		
	}

}