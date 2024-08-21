package com.rahul.assignments;

import static com.rahul.basic.DriverLaunch.launch;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = launch("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div#start button")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				if (driver.findElement(By.cssSelector("div#finish h4")).isDisplayed()) {

					return driver.findElement(By.cssSelector("div#finish h4"));

				} else {

					return null;
				}

			}
		});

		driver.findElement(By.cssSelector("div#finish h4")).isDisplayed();
		String s4 = driver.findElement(By.cssSelector("div#finish h4")).getText();
		System.out.println(s4);
		driver.quit();

	}

}
