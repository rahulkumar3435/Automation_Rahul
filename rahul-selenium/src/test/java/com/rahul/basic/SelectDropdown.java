package com.rahul.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDropdown extends BaseTest {

	@Test
	public void changeCurrency() {
		// TODO Auto-generated method stub

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select value = new Select(dropDown);
		value.selectByIndex(3);
		Assert.assertEquals(value.getFirstSelectedOption().getText(), "USD");

		System.out.println(value.getFirstSelectedOption().getText());
		value.selectByValue("INR");

	}

}
