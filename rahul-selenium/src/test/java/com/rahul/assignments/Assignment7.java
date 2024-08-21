package com.rahul.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.rahul.basic.DriverLaunch.launch;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.xpath("//*[@class='table-display']//tr")).size());
		System.out.println(driver.findElements(By.xpath("//*[@class='table-display']//tr[1]/th")).size());
		
		System.out.println(driver.findElement(By.xpath("//*[@class='table-display']//tr[3]")).getText());

	}

}
