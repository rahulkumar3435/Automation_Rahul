package AdvanceProblems;

import static com.rahul.basic.DriverLaunch.launch;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List <WebElement> vegCount = driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr"));
		
		List <String> riceCount = vegCount.stream().filter(s->s.getText().contains("Rice")).map(s->s.getText()).collect(Collectors.toList());
		
		Assert.assertEquals(vegCount.size(), riceCount.size());
		
		driver.quit();

	}

}
