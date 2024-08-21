package com.rahul.basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {
	
	
	static  int a=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(a);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		List<WebElement> options = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));

		for (WebElement x : options) {

			if (x.getText().equalsIgnoreCase("india")) {

				x.click();
				break;
			}
		}

		driver.quit();

	}

}
