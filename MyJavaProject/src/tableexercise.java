

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableexercise {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18606/nz-vs-pak-2nd-odi-pakistan-tour-of-new-zealand-2018");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0; i<count-2; i++) {
			//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger = Integer.parseInt(value);
			sum=sum+valueinteger;
		}
		
		//System.out.println(driver.findElement(By.xpath(".//div[text()='Extras']/following-sibling::div")).getText());
		String Extras=driver.findElement(By.xpath(".//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(Extras);
		int TotalSumValue=sum+extrasValue;
		System.out.println(TotalSumValue);
		//System.out.println(driver.findElement(By.xpath(".//div[text()='Total']/following-sibling::div")).getText());
		String ActualTotal=(driver.findElement(By.xpath(".//div[text()='Total']/following-sibling::div")).getText());
		int Actualvalue = Integer.parseInt(ActualTotal);
		if(TotalSumValue==Actualvalue) {
			System.out.println("Success");
		} else {
			System.out.println("Please Recount");
		}
	}

}
