package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.xpath("//input[@id='user_email']");
	
	By password = By.xpath("//input[@id='user_password']");
	
	By loginbtn = By.xpath("//input[@value='Log In']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement emailId() {

		return driver.findElement(email);
	}
	
	public WebElement password() {

		return driver.findElement(password);
	}
	
	public WebElement loginbtn() {

		return driver.findElement(loginbtn);
	}
}
