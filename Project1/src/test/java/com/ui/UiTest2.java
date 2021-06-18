package com.ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest2 {
    
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com");
		driver.manage().window().maximize();
		driver.findElementByCssSelector("#text-input-what").sendKeys("QA Analyst");
		driver.findElementByCssSelector("button[type='submit']").click();
		driver.close();

	}

}
