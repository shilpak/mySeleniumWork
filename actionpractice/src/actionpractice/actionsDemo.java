package actionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.com");
		dr.manage().window().maximize();
		Actions act = new Actions(dr);
		WebElement move = dr.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		act.moveToElement(dr.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		act.moveToElement(move).build().perform();
	}

}
