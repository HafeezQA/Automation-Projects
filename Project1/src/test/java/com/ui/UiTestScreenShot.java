package com.ui;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTestScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
			
			  WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
			  ChromeDriver(); driver.manage().timeouts().implicitlyWait(30,
			  TimeUnit.SECONDS); driver.get("https://www.ebay.com");
			  
			  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(scrFile, new File(".//screenshots//screenshotfilename+.png"));
			  
			 
		 
		 

	}

}
