package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertDemo {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/selenium/delete_customer.php");
        
        driver.findElement(By.name("cusid")).sendKeys("54220");					
        driver.findElement(By.name("submit")).submit();	
        
        //switching to alert
        Alert alert = driver.switchTo().alert();
        
        //capturing the text alert message
        
        String alertMessage= driver.switchTo().alert().getText();	
        
        //to show the alert message
        System.out.println(alertMessage);
        
        Thread.sleep(5000);
        
        alert.accept();
	}

}
