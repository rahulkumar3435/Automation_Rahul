package com.rahul.basic;

import static com.rahul.basic.DriverLaunch.launch;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set <String> windw = driver.getWindowHandles();
		
		Iterator <String> it = windw.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		String email = driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.close();
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(email);
		
		driver.close();
		
		
		
		

	}

}
