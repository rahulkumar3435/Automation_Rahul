package AdvanceProblems;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://money.rediff.com/gainers/bse/daily/groupa");
		
		List <WebElement> total = driver.findElements(By.xpath("//*[@class='dataTable']//tr"));
		
		System.out.println("total no. of companies is "+ total.size());
		
		List <WebElement> comp = driver.findElements(By.xpath("//*[@class='dataTable']//tr/td[1]"));
		
		
		String exp = " Gravita India Ltd. ";
		int y = 1;
		
		for (WebElement x : comp) {
			
			
			if(y==2) {
				
				x.click();
				break;
			}
			
			y++;
		}
		
		

	}

}
