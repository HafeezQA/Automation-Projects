package com.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.kayak.com/flights");
		driver.manage().window().maximize();
		driver.findElementByCssSelector("#IX-8-origin-airport").clear();
		
		
	
		    
		}
	}
		

	



