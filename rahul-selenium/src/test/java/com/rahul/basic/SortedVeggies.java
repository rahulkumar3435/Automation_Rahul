package com.rahul.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.rahul.basic.DriverLaunch.launch;

import java.util.List;
import java.util.stream.Collectors;

public class SortedVeggies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//*[@class='table table-bordered']//th[1]")).click();
		
		List <WebElement> veg = driver.findElements(By.xpath("//*[@class='table table-bordered']//td[1]"));
		
		List <String> vegName = veg.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List <String> sorted = vegName.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(vegName.equals(sorted));
		
		driver.quit();
		
		
		

	}

}
