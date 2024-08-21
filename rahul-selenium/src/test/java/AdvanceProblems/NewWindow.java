package AdvanceProblems;

import static com.rahul.basic.DriverLaunch.launch;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = launch("https://rahulshettyacademy.com/angularpractice/");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set <String> windId = driver.getWindowHandles();
		Iterator <String> it = windId.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.get("https://www.rahulshettyacademy.com/");
		String courseTitle = driver.findElement(By.xpath("(//h2//a[contains(@href,\"https://courses.rahulshettyacademy.com/p\")])[2]")).getText();
		driver.switchTo().window(parentId);
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(courseTitle);
		
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("logo.png"));
		
		int height = name.getRect().getDimension().getHeight();
		System.out.println(height);
		int width = name.getRect().getDimension().getWidth();
		System.out.println(width);
		
		driver.quit();
		
		

	}

}
