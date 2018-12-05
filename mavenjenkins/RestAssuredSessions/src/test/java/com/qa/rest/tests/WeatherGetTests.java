package com.qa.rest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WeatherGetTests {
	
	
	@Test
	public void getWeatherDetailsWithValidCityTest() {
		
		//define BaseURL
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		// define the http request:
		RequestSpecification httpRequest = RestAssured.given();
		
		//Make Request:
		Response response = httpRequest.request(Method.GET, "/Pune");
		
		String responseBody = response.getBody().asString();
		
		System.out.println("Response body" + responseBody);
		//validate city name or validate the key: value
		Assert.assertEquals(responseBody.contains("Pune"), true);
		
		//get the status code  and validate it
		int statuscode = response.getStatusCode();
		
		System.out.println(statuscode);
		
		Assert.assertEquals(statuscode, 200);
		
		System.out.println("the status line is : " + response.getStatusLine());
		
		//get the headers:
		Headers headers = response.getHeaders();
		
		System.out.println(headers);
		
		String contentType = response.getHeader("Content-Type");
		
		System.out.println(contentType);
		
	//get the key value by using JsonPath
		JsonPath jsonpathvalue = response.jsonPath();
		String city = jsonpathvalue.get("City");
		
		System.out.println(city);
		
		String temp = jsonpathvalue.get("Temperature");
		
		System.out.println(temp);
		
		String windSpeed = jsonpathvalue.get("WindSpeed");
		
		System.out.println(windSpeed);
		
	}
	
	@Test
	public void getWeatherDetailsWithInvalidCityTest() {
		
		//define BaseURL
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		// define the http request:
		RequestSpecification httpRequest = RestAssured.given();
		
		//Make Request:
		Response response = httpRequest.request(Method.GET, "/test123");
		
		String responseBody = response.getBody().asString();
		
		System.out.println("Response body" + responseBody);
		//validate city name or validate the key: value
		Assert.assertEquals(responseBody.contains("internal error"), true);
		
		//get the status code  and validate it
		int statuscode = response.getStatusCode();
		
		System.out.println(statuscode);
		
		Assert.assertEquals(statuscode, 400);
		
		System.out.println("the status line is : " + response.getStatusLine());
		
		//get the headers:
		Headers headers = response.getHeaders();
		
		System.out.println(headers);
		
		String contentType = response.getHeader("Content-Type");
		
		System.out.println(contentType);
		
	//get the key value by using JsonPath
		JsonPath jsonpathvalue = response.jsonPath();
		String city = jsonpathvalue.get("City");
		
		System.out.println(city);
		
		String temp = jsonpathvalue.get("Temperature");
		
		System.out.println(temp);
		
		String windSpeed = jsonpathvalue.get("WindSpeed");
		
		System.out.println(windSpeed);


}
}
