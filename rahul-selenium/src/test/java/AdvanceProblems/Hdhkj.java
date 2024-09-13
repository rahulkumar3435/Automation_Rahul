package AdvanceProblems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdhkj {
	
	public static void sum() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//*[@title='Sign up for Facebook']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		driver.navigate().back();
		

		
          
}

}
