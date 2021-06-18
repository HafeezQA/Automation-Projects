package com.ui;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest9_HandleWindows {
    
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.salesforce.com/");
	driver.manage().window().maximize();
	driver.findElementByCssSelector("#_content_www_en_us_home_jcr_content_main-par_columncontainer_375d > div > div > div.container > div.row.columns-wrapper > "
	+ "div.col.text-left.col-xs-12.col-sm-12.col-md-6-ten.col-lg-6-ten > "
	+ "div.buttonCTAComponent.parbase.section > div > div.cta_0.buttonCTAItemComponent.parbase > div > a > span").click();
	Set<String> wh = driver.getWindowHandles();
	System.out.println(wh);
	java.util.Iterator<String> it = wh.iterator();
	
	String pw = it.next();
	String cw = it.next();
	driver.switchTo().window(cw);
	driver.findElement(ByName.name("UserFirstName")).sendKeys("sdsds");
	driver.findElement(ByName.name("UserLastName")).sendKeys("lkljj");
	driver.switchTo().window(pw);
	
	
	
	
	
	
		
		
	
		
		
		
		
		

	}

}
