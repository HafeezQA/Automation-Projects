package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test

public class VerifyTitle {
	
	
	public void Title()
	{
		String expectedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
		
		
	}

}
