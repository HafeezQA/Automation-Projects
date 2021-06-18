package com.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest6_RadioButtons {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	driver.get("https://www.mercurytravels.co.in/flights");
	driver.manage().window().maximize();
	WebElement radio1= driver.findElement(By.xpath("//*[@id=\"left-search\"]"
	+ "/div[1]/div/label[2]/input"));
	radio1.click();
	System.out.println(radio1.isSelected());
	
		
		
		
		
	
		    
		}
	}
		

	



