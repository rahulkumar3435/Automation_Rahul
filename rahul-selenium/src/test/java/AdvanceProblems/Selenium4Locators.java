package AdvanceProblems;

import static com.rahul.basic.DriverLaunch.launch;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium4Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = launch("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement inputbox = driver.findElement(By.cssSelector("[name='name']"));
		
		String text = driver.findElement(with(By.tagName("label")).above(inputbox)).getText();
		
		System.out.println(text);
		
		WebElement birthdate = driver.findElement(By.cssSelector("[name='bday']"));
		String text1 = driver.findElement(with(By.tagName("input")).below(birthdate)).getText();
		
		System.out.println(text1);
		
		WebElement checkbox = driver.findElement(By.id("exampleCheck1"));
		String text2 = driver.findElement(with(By.tagName("label")).toRightOf(checkbox)).getText();
		System.out.println(text2);
		
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		String text3 = driver.findElement(with(By.tagName("label")).toLeftOf(radioButton)).getText();
		System.out.println(text3);
		
		
		driver.quit();
		
	}

}
