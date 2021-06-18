package com.ui;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest10_MouseActions {
    
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.Amazon.com/");
	driver.manage().window().maximize();
	WebElement e =driver.findElementByXPath("//*[@id=\"nav-link-accountList\"]/span[1]");
	Actions a = new Actions(driver);
	a.moveToElement(e).perform();
	
	
	
	
	
	
	
	
	
	
	
		
		
	
		
		
		
		
		

	}

}
