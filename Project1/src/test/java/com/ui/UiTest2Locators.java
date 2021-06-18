package com.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest2Locators {
public static String bowser ="chrome";
public static WebDriver driver;

public static void main(String[] args) {
	
   if (browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
   }else if(browser.equals("Firefox")) {
	   WebDriverManager.firefoxdriver().setup();
      driver = new Firefoxdriver();{
   }else if(browser.equals("edge")) {
    	WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
   }	
		
		driver.get("https://www.indeed.com");
		driver.manage().window().maximize();
		driver.findElementByCssSelector("#text-input-what").sendKeys("QA Analyst");
		driver.findElementByCssSelector("button[type='submit']").click();
		driver.close();

	

