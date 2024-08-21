package com.rahul.basic;

import static com.rahul.basic.DriverLaunch.launch;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ScrollByJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = launch("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=400");
		
		List <WebElement> values = driver.findElements(By.xpath("//*[@class='tableFixHead']//td[4]"));
		Iterator <WebElement> it = values.iterator();
		int sum = 0;
		
		while(it.hasNext()) {
			
			int numb = Integer.parseInt(it.next().getText());
			sum = sum + numb;
		}
		
		int actual = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(actual, sum);
		
		driver.quit();
		
	}

}
