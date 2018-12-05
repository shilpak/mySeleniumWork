package Academy;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MainPage;
import resources.base;

public class validateTitle extends base{

	@BeforeTest
	public void initialize() throws IOException {
		driver = intiallizeDriver();
			
}

	@Test
	public void basePageInvocation() throws IOException {

		driver.get(prop.getProperty("url"));
		MainPage mn = new MainPage(driver);
		//compare the text from the browser
		Assert.assertEquals(mn.gettitle().getText(), "FEATURED COURSES");
		//navbar is present 
		Assert.assertTrue(mn.navbar().isDisplayed());		
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
