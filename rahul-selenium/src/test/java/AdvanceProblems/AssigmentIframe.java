package AdvanceProblems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@title=\"W3Schools HTML Tutorial\"]")));

		driver.findElement(By.xpath("//*[@id='menubtn_container']/following-sibling::a[2]")).click();
	}

}
