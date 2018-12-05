package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.client.RestClient;

public class GetAPITestCase {
	
	String url = "http://restapi.demoqa.com/utilities/weather/city";
	String apiUrl;
	RestClient restClient;
	
	@BeforeMethod
	public void setUp() {
		apiUrl = url + "/Pune";
	}
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		CloseableHttpResponse closeableHttpResponse = restClient.get(apiUrl);
		
		//status code:we only thorugh status line 
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("The status code is:" + statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		//json String
		HttpEntity httpEntity = closeableHttpResponse.getEntity();
		String responseString = EntityUtils.toString(httpEntity);
		System.out.println("The response string is:" +  responseString);
		
		Header headersArray[] = closeableHttpResponse.getAllHeaders();
		HashMap<String,String> allheaders = new HashMap<String,String>();
		for(Header header : headersArray) {
			allheaders.put(header.getName(),header.getValue());
		}
			System.out.println(allheaders);
			String contentType = allheaders.get("Content-Type");
			System.out.println(contentType);
			Assert.assertEquals(contentType, "application/json");
		}

	}
	


