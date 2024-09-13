package com.rahul.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SelectDate {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String monthNumber = "6";

		String date = "15";

		String year = "2027";
		
		String expected[] = {monthNumber,date,year};
		
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button.react-date-picker__button")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile.react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List <WebElement> expectlist = driver.findElements(By.xpath("//*[@class=\"react-date-picker__inputGroup\"]/input"));
		
		for (int i=0;i<expectlist.size()-1;i++) {
			
			String actual = expectlist.get(i+1).getAttribute("value");
			System.out.println(actual);
		    Assert.assertEquals(expected[i], actual);	
		}
		
		driver.quit();

}}
