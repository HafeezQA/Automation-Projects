package com.ui;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest_KeyBoard {
    
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://extendsclass.com/text-compare.html");
	driver.manage().window().maximize();
	WebElement source = driver.findElementByXPath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]"
	+ "/div/div/div/div[5]/div[14]/pre");
	Actions action = new Actions(driver);
	
action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
Thread.sleep(3000);
WebElement target = driver.findElementByXPath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]");
Thread.sleep(3000);
action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
		
		
		
		
		

	}

}
