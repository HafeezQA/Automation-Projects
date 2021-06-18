package com.test_cases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.object_repository.RediffHome;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LogIn {
	
	
	@BeforeTest
	public void logInapplication()
	{
		System.out.println("LogIn to application");
	}
	@AfterTest
	public void logoutapplication()
	{
		System.out.println("Logout to application");
	}
	
	@BeforeMethod
	
	public void connectToDB()
	{
	    System.out.println("DB Connected");	
	}
	
	@AfterMethod
	public void DisconnectToDB()
	{
	    System.out.println("DB DisConnected");	
	}
	
	
	@Test(priority=1,description ="This is login test")
	public void Login()
	{

      System.out.println("LogIn is successful");	
		
	}
	@Test(description ="This is logout test")
	public void LogOut()
	{
		System.out.println("LogOut is succesful");
	}
	
	
	

}
