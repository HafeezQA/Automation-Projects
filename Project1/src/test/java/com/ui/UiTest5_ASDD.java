package com.ui;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest5_ASDD {
    
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try {
		driver.get("https://www.kayak.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"c-8cZ-origin-airport\"]").click();
		driver.findElementByXPath("//*[@id=\"c-8cZ-origin-airport\"]").sendKeys("charlotte");
		}catch( Exception e) {
			
		System.out.println("Something Went Wrong");
	
		    
		}
		

	}

}
