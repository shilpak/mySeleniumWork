package com.mmps.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mmps.pages.PatientLoginPage;
import com.mmps.util.BaseClass;

public class Logintest extends BaseClass{
    
	@Parameters({"username", "password"})
	@Test
	
	public void PatientLoginTest(String username, String password) throws InterruptedException{
		PatientLoginPage lg = new PatientLoginPage(driver);
		lg.login(username,password);
	}
	
}

