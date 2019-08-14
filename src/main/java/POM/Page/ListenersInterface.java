package POM.Page;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import POM.Page.*;


public class ListenersInterface implements ITestListener

{
	
	

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("E:\\eclipse\\file.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		 ExtentTest logger=extent.createTest(arg0.getName());
		 logger.log(Status.INFO, "Login");
		 
		 logger.log(Status.PASS, "Title verified");
		 
		 
		 
		 extent.flush();
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

		
}			
