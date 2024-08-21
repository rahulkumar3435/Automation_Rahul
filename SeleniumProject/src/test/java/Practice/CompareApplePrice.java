package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareApplePrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple 15 Pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(5000);
		List <WebElement> Textname = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
		
		int MinPrice=Integer.MAX_VALUE;
		int MinIndex =0;
		for (WebElement x:Textname) {
			
			String S=x.getText().replace(",","");
			int price=Integer.valueOf(S);
			
			if (MinPrice>price) {
				MinPrice=price;
				MinIndex = Textname.indexOf(x);
			}
					
			System.out.println(price);
				
		}
		System.out.println("*****************************************************************************************************");
		System.out.println(MinPrice);
		//System.out.println("Apple");
		//System.out.println(driver.findElement(By.xpath("(//*[@class='a-price-whole'])[" + MinIndex + "]/ancestor::*[10]/*[1]//*[2]")).getAttribute("innerText"));
		System.out.println(driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).get(MinIndex).getText());
		
		driver.quit();

	}

}
