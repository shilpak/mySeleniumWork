package actionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://qaclickacademy.com/");
		dr.manage().window().maximize();
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.cssSelector("div[class='sumome-react-svg-image-container']"))).build().perform();
	}

}
