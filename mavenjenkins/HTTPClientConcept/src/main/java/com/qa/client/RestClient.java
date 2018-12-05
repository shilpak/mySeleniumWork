package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {

		//get call
		CloseableHttpClient httpClient = HttpClients.createDefault(); //creating httpClient
		HttpGet httpGet = new HttpGet(url); //http get request
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
		return closeableHttpResponse;

	}

	//post call
	public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient = HttpClients.createDefault(); //creating client
		HttpPost httpPost = new HttpPost(url); //http post request
		httpPost.setEntity(new StringEntity(entityString)); //for adding payload

		//add headers:
		for(Entry<String, String> entry : headerMap.entrySet()) {
			httpPost.addHeader(entry.getKey(), entry.getValue());
		}

		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpPost);
		return closeableHttpResponse;
	}
	
	//put call:
	public CloseableHttpResponse put(String url, String entityString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault(); //creating client
		HttpPut httpPut = new HttpPut(url); //http post request
		httpPut.setEntity(new StringEntity(entityString)); //for adding payload

		//add headers:
		for(Entry<String, String> entry : headerMap.entrySet()) {
			httpPut.addHeader(entry.getKey(), entry.getValue());
		}

		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpPut);
		return closeableHttpResponse;
	}
	
	//delete call:
	public CloseableHttpResponse delete(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault(); //creating client
		HttpDelete httpDelete = new HttpDelete(url); //http delete request

		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpDelete);
		return closeableHttpResponse;
	}
}
















