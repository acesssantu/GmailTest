package com.xactly.automation.GmailTest;

import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.Method;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import junit.framework.Assert;

public class sampleTest {

		 
		@Test
		public void GetWeatherDetails()
		{   
			// Specify the base URL to the RESTful web service
			RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 
			// Get the RequestSpecification of the request that you want to sent
			// to the server. The server is specified by the BaseURI that we have
			// specified in the above step.
			RequestSpecification httpRequest = RestAssured.given();
	 
			// Make a request to the server by specifying the method Type and the method URL.
			// This will return the Response from the server. Store the response in a variable.
			Response response = httpRequest.get("/Hyderabad");
	 
			// Now let us print the body of the message to see what response
			// we have recieved from the server
			String responseBody = response.getBody().asString();
			System.out.println("1.Response Body is =>  " + responseBody);

			
			String Session_Id = response.getSessionId();
			int statuscode = response.getStatusCode();

			System.out.println("1.Session Id =>  " + Session_Id);
			System.out.println("2.Status code =>  " + statuscode);
			
			Assert.assertEquals(statuscode, 200);
			

	 
		}
	 
	
}
