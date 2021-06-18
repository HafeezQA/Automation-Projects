package com.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test failed - screenshot captured");
	}
	
	

}
