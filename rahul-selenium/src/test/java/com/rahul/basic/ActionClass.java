package com.rahul.basic;

import static com.rahul.basic.DriverLaunch.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://www.amazon.in");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		
		driver.findElement(By.xpath("(//*[@id='nav-al-your-account']/a)[1]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
