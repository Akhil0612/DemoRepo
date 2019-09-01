package com.fb.qa.util;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReport1{


	@Test

	public  void  test(){

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/Learn.html");

		ExtentReports logger= new ExtentReports();
		logger.attachReporter(reporter);
		ExtentTest ext= logger.createTest("test");
		ext.log(Status.INFO, "The Login Test is");
		ext.log(Status.PASS, "Verified");
		logger.flush();



		System.out.println("The Login Test is" );



	}
}

