package com.qa.rest.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateCustomerPostCall {

	@Test
	public void createCustomerTest() {

		//define base url
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";

		//define http request
		RequestSpecification httpRequest = RestAssured.given();

		//create Json object with all the fields:
		JSONObject requestJson = new JSONObject();
		requestJson.put("FirstName","shilpa");
		requestJson.put("LastName","kothari");
		requestJson.put("UserName","shilpakothari");
		requestJson.put("Password","shilpak456");
		requestJson.put("Email","shilpa@gmail.com");

		//Add header
		httpRequest.header("Content-Type", "application/json");

		//add the json payload to the body of the request:
		httpRequest.body(requestJson.toJSONString());

		//post the request and get the response
		Response response = httpRequest.post("/register");

		String responseBody = response.getBody().asString();

		System.out.println("Response body" + responseBody);

		int statuscode = response.getStatusCode();

		System.out.println(statuscode);

		Assert.assertEquals(statuscode, 200);

		System.out.println("the status line is : " + response.getStatusLine());

		//get the headers:
		Headers headers = response.getHeaders();

		System.out.println(headers);

		String contentType = response.getHeader("Content-Type");

		System.out.println(contentType);


	}

}
