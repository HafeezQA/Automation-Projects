package com.ui;

import java.util.concurrent.TimeUnit;

import javax.management.relation.Role;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTestXpath1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='first_name']").sendKeys("shaikh");
		driver.findElementByXPath("//input[@id='last_name']").sendKeys("hafeez");
		driver.findElementByXPath("//input[@id='email']").sendKeys("shafeez75@gmail.com");
		WebElement jr = driver.findElement(By.id("job_role"));
		Select se = new Select(jr);
		driver.findElementByXPath("//input[@name='user[company]']").sendKeys("helloworld");
		driver.findElementByXPath("//*[@id=\"postal_code\"]").sendKeys("28075");
		se.selectByVisibleText("Administrator");
		
        
	}

}
