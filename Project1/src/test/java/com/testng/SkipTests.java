package com.testng;

import org.testng.annotations.Test;

public class SkipTests {
	Boolean datasetup =true;
	
	@Test(enabled=false)
	public void skiptest1()
	{
		
		System.out.println("Skip as not complete");	
	}
	@Test
	public void skiptest2()
	{
		
		System.out.println("Run this test");	
		
	}
	@Test
	public void skiptest3()
	{
		
		System.out.println("Skip based on condition");	
		if (datasetup == true)
		{
			System.out.println("execute the test");
		}
		else 
		{
			System.out.println("do not execute further steps");
		}
		
	}

}
