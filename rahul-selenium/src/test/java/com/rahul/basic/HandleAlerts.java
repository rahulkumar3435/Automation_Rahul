package com.rahul.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandleAlerts {

//	@BeforeSuite
//  public WebDriver driverlaunch() {
//	  
//	   WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        return driver;
	// }
//	@BeforeTest
//	public void (WebDriver driver){
//		
//		driver.get(null);
//	}

//	@AfterSuite
//   public void close (WebDriver driver) {
//		driver.quit();
//	}

	@Test
	public void handleOk() {
		WebDriver driver;
		driver = DriverLaunch.launch("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Rahul Kumar");
		driver.findElement(By.id("alertbtn")).click();

		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);

		SoftAssert sassert = new SoftAssert();
		sassert.assertTrue(alertText.contains("Rahul"));

		// create on alert object and use it to handle alerts throughout the project
		Alert al = driver.switchTo().alert();
		al.accept();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(al.getText());
		al.dismiss();

		driver.quit();

	}
}
