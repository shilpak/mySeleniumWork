package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class forwardandbackward {

	@Test
	public void navigationForwardExample() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String URL="https://www.google.com";
		driver.get(URL);
		driver.findElement(By.name("q")).sendKeys("selenium automation");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//List <WebElement> allLinks=driver.findElements(By.tagName("a").partialLinkText("selenium"));
		List <WebElement> allLinks = driver.findElements(By.xpath("//div[@id='center_col']//h3"));

		int totalLinks = allLinks.size();
		System.out.println(totalLinks);
		for(int i = 0; i<= totalLinks; i++) {
			
			WebElement link = allLinks.get(i);
			
			if(link.getAttribute("href") != null)
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement res = wait.until(ExpectedConditions.elementToBeClickable(link));	
			System.out.println(link.getText());
			res.click();
			
			if(driver.getPageSource().contains("selenium")) {
				System.out.println("text present");
			}else {
				System.out.println("text not present");
			}
			driver.navigate().back();
			//Thread.sleep(10000);
			
			allLinks=driver.findElements(By.xpath("//div[@id='center_col']//h3"));		
			
			System.out.println("success");
		}
	}			
}






