package com.restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	@Test
	void getweatherDeatils()
	{
		//Specify base URI
	RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	    //Request Object
	RequestSpecification httpRequest = RestAssured.given();	
	   //Response Object
	Response response = httpRequest.request(Method.GET,"hyderabad");
	   //Print response in console window
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"  + responseBody);
	  //Status code validation
	int statusCode =response.getStatusCode();
	System.out.println("Status code is:" + statusCode);
	Assert.assertEquals(statusCode, 200);
	  //Status Line verification
	String statusLine = response.getStatusLine();
	System.out.println("Status line:"+ statusLine);
	Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");	

}
}
