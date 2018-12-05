package pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class testforward {
	
	@Test
	public void navigationForwardExample() throws Exception
       {
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String URL="http://www.facebook.com";
		driver.navigate().to(URL);
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		WebElement username = driver.findElement(By.id("email"));
		
		boolean seen = username.isEnabled();
		assertEquals(seen, true);
		username.sendKeys("shilpa_kothari@hotmail.com");
		
WebElement link = driver.findElement(By.xpath("//a[text()='Forgot account?']"));
		String strlink = link.getText();
		System.out.println(strlink);
		Dimension strlink1 = link.getSize();
		System.out.println("Height # " + strlink1.height + " Width # " + strlink1.width);
		
		WebElement name = driver.findElement(By.id("blueBarDOMInspector"));
		Point point = name.getLocation();
		System.out.println(point);
		String color = name.getCssValue("text-align");
		System.out.println(color);
		
		WebElement button = driver.findElement(By.id("loginbutton"));
		Point point1 = button.getLocation();
		String strLine = System.getProperty("line.separator");
		System.out.println("X cordinate# " + point1.x + strLine + "Y cordinate# " + point1.y);
	}

}
