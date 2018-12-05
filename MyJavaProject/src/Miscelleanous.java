import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     //if we know cookies name
    // driver.manage().deleteCookieNamed("abcdef");
     driver.get("http://www.google.com");
     
     }

}
