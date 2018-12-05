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

public class DeleteAPITest {
	
	String url = "https://reqres.in/api/users/";
	String apiUrl;
	RestClient restClient;
	
	@BeforeMethod
	public void setUp() {
		apiUrl = url + "/2";
	}
	
	@Test
	public void deleteAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		CloseableHttpResponse closeableHttpResponse = restClient.delete(apiUrl);
		
		//status code:we only thorugh status line 
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("The status code is:" + statusCode);
		
		Assert.assertEquals(statusCode, 204);
		
		HttpEntity httpEntity = closeableHttpResponse.getEntity();
		
		Header headersArray[] = closeableHttpResponse.getAllHeaders();
		HashMap<String,String> allheaders = new HashMap<String,String>();
		for(Header header : headersArray) {
			allheaders.put(header.getName(),header.getValue());
		}
			System.out.println(allheaders);

		}
		
	}

