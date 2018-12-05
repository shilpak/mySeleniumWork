package actionpractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionsDemo6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20234/ire-vs-afg-1st-odi-afghanistan-tour-of-ireland-2018");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		int sum = 0;
		for (int i= 0; i < count-2; i++) 

		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInteger = Integer.parseInt(value);
			sum = sum + valueInteger;
		}

		String valueExtras = driver.findElement(By.xpath("//*[@id='innings_1']//div[text()='Extras']/following-sibling::div")).getText();

		int extravalue = Integer.parseInt(valueExtras);
		int total = sum + extravalue;
		String Actualtotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

		int actualValue = Integer.parseInt(Actualtotal);

		System.out.println(actualValue);

	}

}

