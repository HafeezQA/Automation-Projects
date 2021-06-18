package com.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest8_alert {
    
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		driver.manage().window().maximize();
	
		driver.switchTo().frame(0);
	
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().accept();
		
		
		driver.switchTo().parentFrame();
	
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		

	}

}
