package com.ui;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest_ExplicitWait {
    
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.ebay.com/");
		
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(
By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"))).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
		
		
		
		
		

	}

}
