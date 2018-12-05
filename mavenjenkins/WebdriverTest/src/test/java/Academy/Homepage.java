package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MainPage;
import resources.base;

public class Homepage extends base{

	@Test(dataProvider = "getData")
	public void basePageInvocation(String username, String Password) throws IOException {
		driver = intiallizeDriver();
		driver.get(prop.getProperty("url"));

		MainPage mn = new MainPage(driver);
		mn.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.emailId().sendKeys(username);
		
		lp.password().sendKeys(Password);		
		
		lp.loginbtn().click();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "abcd@gmail.com";
		data[0][1] = "123456";
		
		
		data[1][0] = "efgh@gmail.com";
		data[1][1] = "767345";
		
		
		return data;
	}

}
