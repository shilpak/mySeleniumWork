package com.mmps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientLoginPage {
  
	WebDriver driver;
	
	public PatientLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) throws InterruptedException {

	    
		driver.findElement(By.xpath("//a[@href='portal/login.php']")).click();
	    driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
        if(driver.getPageSource().contains(username)) {
			System.out.println("username found");	
		}else {
  	    System.out.println("username not found");
     }
	}
}
