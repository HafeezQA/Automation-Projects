package com.testng;

import org.testng.annotations.Test;

public class LogIn {
	
	
	@Test(priority=2,description="This is login test")
	public void loginTest()
	{
		System.out.println("LogIn is succesful");
	}
	@Test(priority=1,description="This is logout test")
	public void logoutTest()
	{
		System.out.println("LogOut is succesful");
	}
	
}
