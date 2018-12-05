package com.qa.rest.tests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.rest.objects.CustomerResponseFailure;
import com.qa.rest.objects.CustomerResponseSuccess;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCallWithJavaObjects {

	@Test
	public void createCustomerTest() {
		//define base url
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";

		//define http request
		RequestSpecification httpRequest = RestAssured.given();

		//create Json object with all the fields:
		JSONObject requestJson = new JSONObject();
		requestJson.put("FirstName","shilpako");
		requestJson.put("LastName","hkothario");
		requestJson.put("UserName","shilpakothario123");
		requestJson.put("Password","shilpakho456");
		requestJson.put("Email","shilpao123@gmail.com");

		//Add header
		httpRequest.header("Content-Type", "application/json");

		//add the json payload to the body of the request:
		httpRequest.body(requestJson.toJSONString());

		//post the request and get the response
		Response response = httpRequest.post("/register");

		String responseBody = response.getBody().asString();

		System.out.println("Response body" + responseBody);

		//converting json to java
		if (response.statusCode() == 201) {
			CustomerResponseSuccess customerResponse = response.as(CustomerResponseSuccess.class);

			System.out.println(customerResponse.SuccessCode);
			System.out.println(customerResponse.Message);

			Assert.assertEquals("OPERATION_SUCCESS", customerResponse.SuccessCode);
			Assert.assertEquals("Operation completed successfully", customerResponse.Message);

		} else if (response.statusCode() == 200) {
			CustomerResponseFailure customerResponse = response.as(CustomerResponseFailure.class);

			System.out.println(customerResponse.FaultId);
			System.out.println(customerResponse.fault);

			Assert.assertEquals("User already exists", customerResponse.FaultId);
			Assert.assertEquals("FAULT_USER_ALREADY_EXISTS", customerResponse.fault);

		}

	}
}
