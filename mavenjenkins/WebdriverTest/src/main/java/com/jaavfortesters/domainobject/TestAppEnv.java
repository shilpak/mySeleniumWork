package com.jaavfortesters.domainobject;

public class TestAppEnv {

	public static final String DOMAIN = "192.123.0.3";
	public static final String PORT = "67";

	public static String getUrl() {
		// TODO Auto-generated method stub
		return "http://" + DOMAIN + ":" + PORT;
	}

}
