package com.rahul.basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	 WebDriver driver;

	@BeforeMethod
	
	public void driverLaunch(){
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("i am from basetest before method");
		
	}
	
	@AfterMethod
	
	public void close() {
		
		driver.quit();
		System.out.println("i am from base test after method");
	}

}
