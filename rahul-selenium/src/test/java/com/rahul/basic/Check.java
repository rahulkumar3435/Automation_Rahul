package com.rahul.basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static com.rahul.basic.DriverLaunch.launch;

public class Check {
	
    
	@Test
	public void check1() {
		WebDriver driver = launch("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.quit();
		
		
		
	}
	public static void main(String[] args) {
		//DriverLaunch d = new Check();
		launch("ddf");
	}
}
