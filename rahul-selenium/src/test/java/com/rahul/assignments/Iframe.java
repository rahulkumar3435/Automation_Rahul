package com.rahul.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.rahul.basic.DriverLaunch.launch;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = launch("https://www.jqueryui.com/droppable");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.id("menu-top")).getText());
		Thread.sleep(6000);
		driver.quit();
		
	}

}
