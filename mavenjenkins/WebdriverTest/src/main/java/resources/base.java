package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver intiallizeDriver() throws IOException {

		prop = new Properties();

		FileInputStream fs = new FileInputStream("C:\\Users\\Shilpa\\eclipse-workspace\\mavenjenkins\\WebdriverTest\\src\\main\\java\\resources\\data.properties");

		prop.load(fs);
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {

			driver = new FirefoxDriver();

		}
		else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
