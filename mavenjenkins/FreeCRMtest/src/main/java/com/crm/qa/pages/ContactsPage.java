package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.CacheLookup;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//td[contains(text(), 'Contacts')]")
	@CacheLookup
	WebElement contactsLabel;
	
	@FindBy(xpath="//*[@id='first_name']")
	WebElement firstNameLabel;
	
	@FindBy(xpath="//*[@id='surname']")
	WebElement lastNameLabel;
	
	@FindBy(xpath="//*[@name='client_lookup']")
	WebElement companyLabel;
	
	@FindBy(xpath="//*[@id='contactForm']//input[@type='submit' and @value='Save']")
	WebElement saveButton;
	
	
	
	//Initializing the page objects
	public ContactsPage() {		
		//here 'this' means current class object
		PageFactory.initElements(driver,  this);
	}
	
	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}
	
	public void selectContacts(String name) {
		driver.findElement(By.xpath(""));
	}
	
	public void createNewContact(String title, String ftName, String ltname, String comp) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		firstNameLabel.sendKeys(ftName);
		lastNameLabel.sendKeys(ltname);
		companyLabel.sendKeys(comp);
		saveButton.click();
	}
	
}
////*[@name='client_lookup']//following-sibling::input[@value='Lookup']