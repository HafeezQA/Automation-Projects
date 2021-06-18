package com.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
Properties prop = new Properties();
		
FileInputStream inputstream = new FileInputStream("C:\\Users\\shafe\\eclipse-workspace\\SelTraining\\src\\test\\resources\\Object.repo.properties");
prop.load(inputstream);
System.out.println(prop.getProperty("browser"));
System.out.println(prop.getProperty("url"));
FileOutputStream outputstream = new FileOutputStream("C:\\Users\\shafe\\eclipse-workspace\\SelTraining\\src\\test\\resources\\Object.repo.properties");

prop.setProperty("testdata", "4545454");
prop.store(outputstream, "This is customer data");
	
	}

}
