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
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * public static String 		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
     */
    public Base()
    {
        
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
