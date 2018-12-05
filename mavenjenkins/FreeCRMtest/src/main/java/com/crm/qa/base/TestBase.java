package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Shilpa\\eclipse-workspace\\mavenjenkins\\FreeCRMtest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void intialisation() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400-800");
			options.addArguments("headless");
			 driver = new ChromeDriver(options);
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();

		}
		else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}