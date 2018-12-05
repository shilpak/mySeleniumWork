package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	WebDriver driver;

	public RediffHomepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

/*	By search = By.id("srchword");
	
	By submit = By.xpath("//input[@value='Search']");
	
	By searchIcon = By.xpath("//u[contains(text(),'Search')]");*/
	
	@FindBy(id = "srchword")
	
	WebElement search;
	
	@FindBy(xpath = "//input[@value='Search']")
	
	WebElement submit;
	
	@FindBy(xpath = "//u[contains(text(),'Search')]")
	
	WebElement searchIcon;
	
	public WebElement search() {

		return search;
	}
	
	public WebElement submit() {

		return submit;
	}
	
	public WebElement sicon() {

		return searchIcon;
	}
}
