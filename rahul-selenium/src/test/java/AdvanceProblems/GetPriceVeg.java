package AdvanceProblems;

import static com.rahul.basic.DriverLaunch.launch;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetPriceVeg {
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = launch("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//*[@class='table table-bordered']//th[1]")).click();

		// List <WebElement> veges = driver.findElements(By.xpath("//*[@class='table
		// table-bordered']//td[1]"));

		// List <String> vegprice =
		// veges.stream().filter(r->r.getText().contains("Banana")).map(r->getVegiePrice(r)).collect(Collectors.toList());

		// System.out.println(vegprice.get(0));
		List<String> vegprice;

		do {
			List<WebElement> veges = driver.findElements(By.xpath("//*[@class='table table-bordered']//td[1]"));
			vegprice = veges.stream().filter(r -> r.getText().contains("Rice")).map(r -> getVegiePrice(r))
					.collect(Collectors.toList());

			if (vegprice.size() < 1) {

				driver.findElement(By.xpath("//*[@aria-label='Next']")).click();
			}

		} while (vegprice.size() < 1);

		System.out.println(vegprice.get(0));

		driver.quit();

	}

	private static String getVegiePrice(WebElement r) {
		// TODO Auto-generated method stub
		String price = r.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
