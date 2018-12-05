
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class multipleSession {
    @Test    
    public void One(){
            //First session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            driver.findElement(By.name("password")).sendKeys("password 1");
        }
        
    @Test    
        public void Two(){
            //Second session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.findElement(By.name("password")).sendKeys("password 2");
        
        }
        
    @Test    
        public void Three(){
            //Third session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        driver.findElement(By.name("password")).sendKeys("password 3");
        driver.close();
        }        
}