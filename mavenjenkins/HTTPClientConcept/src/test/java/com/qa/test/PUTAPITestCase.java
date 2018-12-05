package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.client.RestClient;
import com.users.data.Users;
import com.users.data.UsersUpdate;

public class PUTAPITestCase {

	String url = "https://reqres.in/";
	String apiUrl;
	RestClient restClient;

	@BeforeMethod
	public void setUp() {
		apiUrl = url + "api/users/2";
	}

	@Test
	public void createUserTest() throws ClientProtocolException, IOException {
		restClient = new RestClient();

		//header prep:
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");

		//prepare json payload: jackson api:core and databind APIs(dependency)
		ObjectMapper mapper = new ObjectMapper();
		UsersUpdate users = new UsersUpdate("tom", "Manager");

		//convert java object to json string: serialization -- marshaling
		String userJsonString = mapper.writeValueAsString(users);
		System.out.println(userJsonString);

		CloseableHttpResponse closeableHttpResponse = restClient.put(apiUrl, userJsonString, headerMap);

		//get status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println(statusCode);//200
		
		//get json payload
		HttpEntity httpEntity = closeableHttpResponse.getEntity();
		String responseString = EntityUtils.toString(httpEntity);
		System.out.println("The response string is:" +  responseString);
		
		//validate 
		String responseStringUsers = EntityUtils.toString(closeableHttpResponse.getEntity());
		JSONObject responseJson = new JSONObject(responseStringUsers);
		System.out.println(responseJson);
		
		//convert json to java object:: deserialization -- un-marshaling
		UsersUpdate usersobj = mapper.readValue(responseStringUsers, UsersUpdate.class);
		System.out.println(usersobj.getName());
		System.out.println(usersobj.getJob());
		
		Assert.assertEquals(usersobj.getName(), users.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}