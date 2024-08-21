package com.rahul.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.rahul.basic.DriverLaunch.launch;

import java.util.Scanner;

public class SelectTagAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://rahulshettyacademy.com/AutomationPractice/");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the option you want to select");
		int option = input.nextInt();
		
		driver.findElement(By.xpath("(//*[@id='checkbox-example']//label/input)["+option+"]")).click();
		
		String grabtext = driver.findElement(By.xpath("(//*[@id='checkbox-example']//label)["+option+"]")).getText();
		
		Select st = new Select(driver.findElement(By.id("dropdown-class-example")));
		st.selectByVisibleText(grabtext);
		
		driver.findElement(By.id("name")).sendKeys(grabtext);
		driver.findElement(By.id("alertbtn")).click();
		
		String alerttext = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		Assert.assertEquals(grabtext, alerttext);
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		

	}

}
