package com.ui;
		
		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class calender {

			private static final String EC = null;

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver ();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.get("https://www.path2usa.com/travel-companions");
				//April 14
				driver.findElement(By.xpath("//*[@id=\'travel_date\']")).click();
				
				while(driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("August"))
				{
					
					driver.findElement(By.cssSelector("[class='datepicker-days']th[class='next']")).click();
				}
							
				List<WebElement> dates = driver.findElements(By.className("day"));
				//Grab common attribute//Put into list and Iterate
				int count=driver.findElements(By.className("day")).size();
				for (int i=0;i<count;i++)
				{
					String text=driver.findElements(By.className("day")).get(i).getText();
					if(text.equalsIgnoreCase("23"))
					{
						driver.findElements(By.className("day")).get(i).click();
						break;
					}
				}
				
			}

			
			}

		


		

	


