package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//td[contains(text(), 'User: shilpa kothari')]")
	WebElement userNameLabel;

	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contactlink;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newcontactlink;

	@FindBy(xpath="//a[@title='Deals']")
	WebElement dealslink;

	@FindBy(xpath="//a[@title='Tasks']")
	WebElement taskslink;

	public HomePage() {		
		//here 'this' means current class object
		PageFactory.initElements(driver,  this);
	}

	//Actions
	public String validateLoginPageTitle() {
		return  driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContactsLink() {
		contactlink.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealsLink() {
		dealslink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		dealslink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactlink).build().perform();
		newcontactlink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
