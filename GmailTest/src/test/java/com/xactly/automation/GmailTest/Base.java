package com.xactly.automation.GmailTest;

import junit.framework.Test;
import junit.framework.TestCase;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.ResponseBody;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * Unit test for simple App.
 */
public class Base {
	
	String bearer_Token = "ya29.Glv5BXTVCm7q-civBES_PUjuAaLRoU1jBDgBSVZtpCvlWbTkSXvHoftQxtgxZq1P_AhiHC__EjDGJ2-jTkdU2ShsxHLVKtAsINF6p4GyzWxawDtMQXPeVwUaap1x";
    String gmail_BaseUrl = "https://www.googleapis.com/gmail/v1/users/accesssantu@gmail.com/"
	
	// Retrieve Scheduler History
		@SuppressWarnings("rawtypes")
		public ResponseBody getSchedulerHistory(String apiToken,String Scheduler_ID) {
			ResponseBody response = RestAssured.given()
					.contentType("application/json")
					.header("Authorization", createAuthHeader(apiToken))
					.expect()
					.statusCode(200)
					.when()
					.get(gmail_BaseUrl+"/messages").getBody();
			return response;
		}
   
}
