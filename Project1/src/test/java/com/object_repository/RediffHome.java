package com.object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffHome {
	
	
	WebDriver driver;
	
	
	
	public  RediffHome(WebDriver driver )
	{
		this.driver = driver;
		
	}
	
	 By username = By.xpath("//input[@id='login1']");
	 By password = By.xpath("//input[@id='password']");
	 By submit = By.xpath("//input[@name='proceed']");
	 
	

}
