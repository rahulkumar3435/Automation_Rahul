package com.rahul.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.rahul.basic.DriverLaunch.launch;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.quit();

	}

}
