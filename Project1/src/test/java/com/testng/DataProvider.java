package com.testng;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider="dataset") 
	public void test(String username , String password)
	{
		System.out.println("========"+password);
	}
	
	
	@org.testng.annotations.DataProvider
	public Object[][] dataset()
	{
		Object[][] dataset = new Object[4][2];
		
		//first row
		dataset[1][0]="user1";
		dataset[0][1]="pass1";
		
		//second row		
		dataset[1][0]="user2";
		dataset[1][1]="pass2";
		
		//Third row		
		dataset[2][0]="user3";
		dataset[2][1]="pass3";
		
		//Fourth row
		dataset[3][0]="user4";
		dataset[3][1]="pass4";
		
		return dataset;	
		
	}

}
