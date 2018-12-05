package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;

	public RediffLoginpage(WebDriver driver) {

		this.driver = driver;
	}

	By username = By.xpath(".//*[@id ='login1']");
	By password = By.xpath(".//*[@id = 'password']");
	By button = By.name("proceed");
	By home = By.linkText("Home");

	public WebElement EmailId() {

		return driver.findElement(username);
	}

	public WebElement password() {

		return driver.findElement(password);
	}

	public WebElement start() {

		return driver.findElement(button);
	}
	
	public WebElement Home() {

		return driver.findElement(home);
	}

}
