package com.Everlywell;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddDiscount {
	
	public static void main(String [] args) throws InterruptedException
	{
		//Invoke the browser
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		//Wait
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//Open URL
        driver.get("https://secure.everlywell.com/login");
        //LogIn
	    driver.findElementByXPath("//*[@id=\"spree_user_login\"]").sendKeys("******");
	    driver.findElementByXPath("//*[@id=\"spree_user_password\"]").sendKeys("*******");
	    driver.findElementByCssSelector("#login-btn").click();
	    //Maximize the Window
	    driver.manage().window().maximize();
	    //Delete cookies
	    driver.manage().deleteAllCookies();
	    //Click on shop button
	    driver.findElementByXPath("//*[@id=\"everlywellHeader\"]/div[1]/div[1]/div[1]/button[1]").click();
	    //Click on Men's health link
	    Thread.sleep(2000);
	    driver.findElementByXPath("//*[@id=\"everlywellHeader\"]/div[1]/div[1]/div[1]/div[1]/nav/button[2]").click();
	   //Click on Men's Health Test link
	    driver.findElementByXPath("//*[@id=\"everlywellHeader\"]/div[1]/div[1]/div[1]/div[1]/div/div/div/a[2]").click();
	    //capture the price of 1 test
	    System.out.println(driver.findElementByXPath("//*[@id=\"app\"]/div[2]/div[2]/section/div[1]/div/div[2]/div/div[2]/div/h3").getText());
	    //Select 5 Tests
	    WebElement wb = driver.findElementById("productQuantity");
	    Select dropdown = new Select(wb);
	    dropdown.selectByIndex(4);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    //Click On Add to Cart Button
	    driver.findElementByXPath("//button[text()='Add to Cart']").click();
	    //Click on Proceed button
	    driver.findElementByXPath("//a[text()='Proceed to Checkout']").click();
	    //Enter Promo code
	    Thread.sleep(2000);
	    driver.findElementByXPath("//input[@class='promo-code form-input']").sendKeys("abcd");
	    driver.findElementByXPath("//input[@value='Enter']").click();
	     
		//Verify the discount applied
	    int discount=0;
	    int tests =0;
	    String  cost = "sum of all products";
	    String Total;
	    
		if(tests>=5)
	    	discount =1 test price;
	    	
	    Total = cost-discount;
	    System.out.println(Total);
	    
	    

}
}
