package com.ui;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Ui_StreamTest {

	public static void main(String[] args) {
				
		    //Count the number of names starting with alphabet A in list 
			@Test
	        public void regular();
	
			
			{
				ArrayList<String> names = new ArrayList<String>();
				names.add("Abhijeet");
				names.add("Don");
				names.add("Alekya");
				names.add("Adam");
				names.add("Ram");
				int count=0;
				
				for(int i=0;i<names.size();i++)
				{
					String actual=names.get(i);
					if(actual.startsWith("A"))
					{
						count++;
					}						
				}
				
				System.out.println(count);	
					
			}

	

	
		
	}

}
