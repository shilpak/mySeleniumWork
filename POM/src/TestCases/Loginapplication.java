package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class Loginapplication {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.EmailId().sendKeys("hello");
		rd.password().sendKeys("great");
		rd.Home().click();
		//rd.start().click();
		
		RediffHomepage rh = new RediffHomepage(driver);
		rh.sicon().click();
		rh.search().sendKeys("sarees");
		rh.submit().click();
	}
	
	

}
