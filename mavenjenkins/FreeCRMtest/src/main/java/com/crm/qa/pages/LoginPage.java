package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends TestBase {

	//Page Factory
	@FindBy(name="username")

	WebElement username;

	@FindBy(name="password")
	WebElement password;

	By loginbtn = By.xpath("//input[@value='Login']");

	@FindBy(xpath="//*[contains(text(), 'Sign Up')]")
	WebElement signUpLink;

	@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement crmLogo;

	//Initialisizing the page objects
	public LoginPage() {
		//here this means current class object
		PageFactory.initElements(driver, this);
	}

	//Actions
	public String validateLoginPageTitle() {
		return  driver.getTitle();
	}

	public boolean validateLogo() {
		return crmLogo.isDisplayed();
	}

	public HomePage login(String us, String pass){
		username.sendKeys(us);
		password.sendKeys(pass);
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginbtn)).click();


		return new HomePage();
	}


















}
