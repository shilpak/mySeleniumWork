package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	WebDriver driver;

	public RediffLoginpagePF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

/*	By username = By.xpath(".//*[@id ='login1']");
	By password = By.xpath(".//*[@id = 'password']");
	By button = By.name("proceed");
	By home = By.linkText("Home");*/
	
	@FindBy(xpath = ".//*[@id ='login1']")
	WebElement username;
	
	@FindBy(xpath = ".//*[@id = 'password']")
	WebElement password;
	
	@FindBy(name = "proceed")
	WebElement button;
	
	@FindBy(linkText = "Home")
	WebElement home;
	
	public WebElement EmailId() {

		return username;
	}

	public WebElement password() {

		return password;
	}

		
	public WebElement Home() {

		return home;
	}

}
