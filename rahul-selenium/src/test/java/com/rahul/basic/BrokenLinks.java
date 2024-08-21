package com.rahul.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static com.rahul.basic.DriverLaunch.launch;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = launch("https://rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> allUrls = driver.findElements(By.xpath("//*[@id='gf-BIG']//a"));
		SoftAssert a = new SoftAssert();
		
		for (WebElement x : allUrls) {
			
			String ur = x.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL (ur).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			
			a.assertTrue(respcode<400, "This link with text "+x.getText()+"is broken with response code"+respcode);
			
		}
		
		driver.quit();
		a.assertAll();
		
        //if status code >400 then that url is not working-> link which tied to url is broken		
//		URL u1 = new URL(URL1);
//		HttpURLConnection conn = (HttpURLConnection) u1.openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int responseCode = conn.getResponseCode();
//		System.out.println(responseCode);
		
	
		
	}

}
