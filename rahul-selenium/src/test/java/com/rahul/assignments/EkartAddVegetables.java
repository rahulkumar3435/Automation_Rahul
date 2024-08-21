package com.rahul.assignments;

import static com.rahul.basic.DriverLaunch.launch;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EkartAddVegetables {

	public static void add1(WebDriver driver, String addItem[]) {

		List<String> items = Arrays.asList(addItem);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int numbOfItem = 0;

		for (int i = 0; i < products.size(); i++) {

			String text[] = products.get(i).getText().split("-");
			String text1 = text[0].trim();

			if (items.contains(text1)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				numbOfItem++;
			}

			if (numbOfItem == addItem.length) {
				break;
			}
		}

		String padded = driver.findElement(By.xpath("(//div[@class='cart-info']//td)[3]/strong")).getText();
		int actual = Integer.parseInt(padded);
		Assert.assertEquals(addItem.length, actual);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = launch("https://rahulshettyacademy.com/seleniumPractise/");

		String addItem[] = { "Onion", "Brocolli", "Cucumber", "Beetroot" };

		add1(driver, addItem);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cart-icon']/img")));
        
		driver.findElement(By.xpath("//*[@class='cart-icon']/img")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='PROCEED TO CHECKOUT']")));
		
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoInfo']")));

		String s = driver.findElement(By.xpath("//*[@class='promoInfo']")).getText();
		System.out.println(s);

		driver.quit();

	}

}
