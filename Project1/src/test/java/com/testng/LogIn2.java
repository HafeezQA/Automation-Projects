package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test

public class LogIn2 {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Run this before class");
	}
	@Test	
	public void logoutTest()
	{
		System.out.println("Run this later");
	}
	
}
