package actionpractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionsDemo4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(dr.getTitle());
		dr.manage().window().maximize();
		WebElement mainfooter = dr.findElement(By.id("gf-BIG"));
		int footer = mainfooter.findElements(By.tagName("a")).size();
		WebElement footerElement = mainfooter.findElement(By.xpath("//tr//td[1]//ul"));
		List<WebElement> columnnumber = footerElement.findElements(By.tagName("a"));

		String []linkText =new String[columnnumber.size()];			

		for(int i=1; i<linkText.length;i++) {
			columnnumber.get(i).sendKeys(Keys.CONTROL, Keys.RETURN);
			Thread.sleep(5000L);
		}

	}
	
}
