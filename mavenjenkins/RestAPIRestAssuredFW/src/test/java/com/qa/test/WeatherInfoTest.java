package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WeatherInfoTest extends TestBase{
	
	@BeforeMethod
	public void setUp() {
		TestBase.init();
	}

	@DataProvider
	public Object[][] getdata() {
		Object testdata[][] = TestUtil.getDataFromSheet(TestUtil.WeatherSheetName);
		return testdata;

	}

	@Test(dataProvider="getdata")
	public void getWeatherDetailsWithValidCityTest(String city, String HTTPMethod, String humidity, String temperature,
			String weatherdescription, String windspeed, String winddirectiondegree) {

		//define BaseURL
		RestAssured.baseURI = prop.getProperty("serviceUrl");

		// define the http request:
		RequestSpecification httpRequest = RestAssured.given();

		//Make Request:
		Response response = httpRequest.request(Method.GET, "/"+city);

		String responseBody = response.getBody().asString();

		System.out.println("Response body" + responseBody);
		//validate city name or validate the key: value
		//Assert.assertEquals(responseBody.contains(city), true);

		//get the status code  and validate it
		int statuscode = response.getStatusCode();

		System.out.println(statuscode);

		//Assert.assertEquals(statuscode, TestUtil.RESPONSE_CODE_200);

		
		System.out.println("the status line is : " + response.getStatusLine());

		//get the headers:
		Headers headers = response.getHeaders();

		System.out.println(headers);

		String contentType = response.getHeader("Content-Type");

		System.out.println(contentType);
		
		String contentLength = response.getHeader("Content-Length");

		System.out.println(contentLength);

		//get the key value by using JsonPath
		JsonPath jsonpathvalue = response.jsonPath();
		String cityval = jsonpathvalue.get("City");

		System.out.println(cityval);
		
		//Assert.assertEquals(cityval, city);

		String temp = jsonpathvalue.get("Temperature");
		//Assert.assertEquals(temp, temperature);

		System.out.println(temp);

		String windSpeed = jsonpathvalue.get("WindSpeed");

		System.out.println(windSpeed);

	}

}
