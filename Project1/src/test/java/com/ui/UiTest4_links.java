package com.ui;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest4_links {
    
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().getCookies();
		driver.manage().window().maximize();
		
		java.util.List<WebElement> tgs =driver.findElementsByTagName("a");
		System.out.println("total tags are: "+tgs.size());
		
		
		for(int i=0;i<tgs.size();i++)
		{
			System.out.println("Links on page are "+tgs.get(i).getAttribute("href"));
		
		    System.out.println("Links on page are "+tgs.get(i).getText());
		    
		}
		

	}

}
