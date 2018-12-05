package webcrawler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;	

public class webcrawler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("terminator\n");
		
		
		WebDriverWait wait = (WebDriverWait)new WebDriverWait(driver, 10);
		Predicate<WebDriver> myPredicate = (d -> d.getTitle().toLowerCase().startsWith("terminator"));
		wait.until(myPredicate);
		System.out.println("Title: " + driver.getTitle());
		
		driver.quit();
	}

}
