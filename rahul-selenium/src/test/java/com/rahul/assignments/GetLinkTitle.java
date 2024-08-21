package com.rahul.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.rahul.basic.DriverLaunch.launch;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class GetLinkTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://qaclickacademy.com/practice.php");
		WebElement footer = driver.findElement(By.xpath("(//*[@id='gf-BIG']//td)[1]"));
		List <WebElement> links = footer.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		String chords = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		for (int i=1;i<links.size();i++) {
			
			links.get(i).sendKeys(chords);
		}
		
		Set <String> winIds = driver.getWindowHandles();
		 Iterator <String> it = winIds.iterator();
		 
		 while(it.hasNext()) {
			 
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
			 driver.close();
			 
		 }
		 
		
		driver.quit();
		

	}

}
