package com.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest3 {
    
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().getCookies();
		driver.manage().window().maximize();
		WebElement wb = driver.findElementByCssSelector("#field27 > div > select");
		Select se = new Select(wb);
		WebElement fo = se.getFirstSelectedOption();
		System.out.println(fo.getText());
		driver.close();
		

	}

}
