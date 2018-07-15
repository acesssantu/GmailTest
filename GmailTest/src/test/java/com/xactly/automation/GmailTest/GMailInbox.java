package com.xactly.automation.GmailTest;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.Method;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;

import junit.framework.Assert;
import net.minidev.json.JSONArray;


public class GMailInbox {

	Base obj = new Base();
		 
		@Test
		public void GetGmail()
		{   
			// Specify the base URL to the RESTful web service
			RestAssured.baseURI = "https://www.googleapis.com/gmail/v1/users/accesssantu@gmail.com";
			
			String Bearer_Token = "ya29.Glv5BXTVCm7q-civBES_PUjuAaLRoU1jBDgBSVZtpCvlWbTkSXvHoftQxtgxZq1P_AhiHC__EjDGJ2-jTkdU2ShsxHLVKtAsINF6p4GyzWxawDtMQXPeVwUaap1x";
			
			RequestSpecification httpRequest = RestAssured.given()
												.header("Authorization",Bearer_Token);
	 
			Response response = httpRequest.get("/messages");
	 
			String responseBody = response.getBody().asString();
			System.out.println("1.Response Body is =>  " + responseBody);

			
			String Session_Id = response.getSessionId();
			int statuscode = response.getStatusCode();

			System.out.println("1.Session Id =>  " + Session_Id);
			System.out.println("2.Status code =>  " + statuscode);
			
			Assert.assertEquals(statuscode, 200);
			
		/*	public Headers getAPIKey(String apiToken, String rbody) {
				Headers response = RestAssured.given()
						.contentType("application/json")
						.body(rbody)
						.header("Authorization", createAuthHeader(apiToken))
						.expect()
						.statusCode(201)
						.when()
						.post(getBaseURL()+"/scheduler/v1/admin/apikeys").getHeaders();
				return response;
*/			}
	 
		}
	 
	
}
