package tests;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.Login;

public class TestLogin {
	private WebDriver driver;
	private Login login;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		login = new Login(driver);
	}
	
	@Test
	public void succeeded() {
		login.with("tomsmith", "SuperSecretPassword!");
	        assertTrue("success message not present",
	                login.successMessagePresent());
	}
	
	@Test
	public void failed() {
		login.with("tomsmith", "badPassword!");
	        assertFalse("failure message wasn't present after providing bogus credentials",
	                login.failureMessagePresent());
	}
	
    

	@After
	public void tearDown() {
		driver.quit();

	}
}
/*traveling to deeper level driver.findElement(By.cssSelector("div#siblings > div:nth-of-type(1) >
div:nth-of-type(3) > div:nth-of-type(3)"));*/
