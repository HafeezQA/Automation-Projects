package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportGeneration {
	
	
	@Test
	
	public void testreport1()
	{
		Reporter.log("This is report1");
		System.out.println("This is report1");
	}
	@Test
	public void testreport2()
	{
		System.out.println("This is report2");
	}
	@Test
	public void testreport3()
	{
		System.out.println("This is report3");
	}
	

}
