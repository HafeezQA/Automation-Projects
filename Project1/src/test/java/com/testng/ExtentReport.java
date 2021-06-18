package com.testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentReport {
	
	ExtentReports ext;
	@BeforeTest
	public void config()
	{
		//ExtentReports,ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter rep = new ExtentSparkReporter(path);
		rep.config().setReportName("Web Automation Results");
		rep.config().setReportName("Test Results");
	    ext = new ExtentReports();
		ext.attachReporter(rep);
		ext.setSystemInfo("Tester", "Shaikh");		
		
	}
	
	@Test
	public void Extrepo()
	{   ExtentTest test =ext.createTest("Ist Test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		System.out.println(driver.getTitle());
		test.addScreenCaptureFromBase64String("screen shots");
		driver.close();
		ext.flush();
		
	}
}
