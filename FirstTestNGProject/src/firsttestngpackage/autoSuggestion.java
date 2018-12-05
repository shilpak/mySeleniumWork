package firsttestngpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.ksrtc.in");
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		
		//Javascript DOM can extract hidden elements
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById('fromPlaceName').value";
		String text=(String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("BENGALURU AIRPRT"))
		{
			driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			
			text=(String) js.executeScript(script);
			System.out.println(text);
		}
	}
	
}


