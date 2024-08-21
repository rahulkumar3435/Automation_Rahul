package AdvanceProblems;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://demo.mobiscroll.com/select/multiple-select");
		//driver.findElement(By.id("multiple-select-input")).click();
		//WebElement dropDown = driver.findElement(By.id("multiple-select-select"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('multiple-select-input').click()");
		
		
		//Select multi = new Select(dropDown);
		//multi.selectByValue("1");
		
		//driver.quit();
		
		

	}

}
