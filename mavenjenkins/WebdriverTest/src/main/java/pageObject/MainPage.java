package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	public WebDriver driver;

	By signin = By.xpath("//span[contains(text(),'Login')]");
	
	By centertext = By.xpath("//h2[contains(text(),'Featured Courses')]");
	
	By navbar = By.xpath("//*[@class='nav navbar-nav navbar-right']//li/a");

	public MainPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getLogin() {

		return driver.findElement(signin);
	}
	
	public WebElement gettitle() {

		return driver.findElement(centertext);
	}
	
	public WebElement navbar() {

		return driver.findElement(navbar);
	}
}
