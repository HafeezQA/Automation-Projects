package com.ui;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest11DragAndDrop {
    
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	WebElement frame = driver.findElementByXPath("//*[@id=\"content\"]/iframe");
	
	driver.switchTo().frame(frame);
	
	
	
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Thread.sleep(10);
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	driver.close();		
		
		

	}

}
