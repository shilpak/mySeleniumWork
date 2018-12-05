package actionpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println(dr.getTitle());
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//a[contains(text(),'Learn more')]")).click();
		
		Set<String>ids = dr.getWindowHandles();
		Thread.sleep(3000);
		Iterator<String> it = ids.iterator();
		String mainwindow = it.next();

		dr.switchTo().window(mainwindow);
		System.out.println(dr.getTitle());
		
	}
	

}
