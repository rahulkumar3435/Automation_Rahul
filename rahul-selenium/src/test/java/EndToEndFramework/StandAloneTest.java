package EndToEndFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pagefactorymodel.LandingPage;
import pagefactorymodel.ProductCatalogue;

public class StandAloneTest {
	
	@Test
	public void addcart() {
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/client");
		
		LandingPage lp = new LandingPage(driver);
		lp.login("rahul12345asdf@rahul.com", "Rahul@12345");
		
		ProductCatalogue pc = new ProductCatalogue(driver);
		
		
		
	}
	
	
	
	
	


}
