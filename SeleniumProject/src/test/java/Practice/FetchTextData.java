package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextData {
	
	public static void main(String []args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List <WebElement> Textname = driver.findElements(By.xpath("//*[@id='nav-main']"));
		
		for (WebElement x:Textname) {
			System.out.println(x.getText());
		}
		
		driver.quit();
	}
	

}
