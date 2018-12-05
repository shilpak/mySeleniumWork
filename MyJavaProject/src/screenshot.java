import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.apache.commons.io.FileUtils;

public class screenshot {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     //if we know cookies name
	    // driver.manage().deleteCookieNamed("abcdef");
	     driver.get("http://www.google.com");
	     
	     WindowsUtils.killByName("excel.exe");
	     
	     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src, new File("C:\\Users\\Shilpa\\Desktop\\udemy bootcamp\\screenshots.png"));
	     }
	}


