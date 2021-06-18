package com.testng;

import org.testng.annotations.Test;

@Test(groups ="User-Registration")

public class GroupTest {
	
	
	@Test(priority=2, groups="regression")
	public void loginTesta()
	{
		System.out.println("TestA");
	}
	@Test (groups={"regression","bvt"})
	public void logoutTestb()
	{
		System.out.println("TestB");
	}
	@Test(groups="regression")
	public void logoutTestc()
	{
		System.out.println("TestC");
	}
	@Test(groups="bvt")
	public void logoutTestd()
	{
		System.out.println("TestD");
	}
}
