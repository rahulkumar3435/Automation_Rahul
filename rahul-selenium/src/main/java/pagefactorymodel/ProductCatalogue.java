package pagefactorymodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomp.AbstractComponent;

public class ProductCatalogue extends AbstractComponent{
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver){
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".mb-3")
	List <WebElement> product;
	
	By productsBy = By.cssSelector(".mb-3");
	
	public List<WebElement> getProductList(){
		
		waitForElementToAppear(productsBy);
		return product;
	}
	
	public WebElement getProductByName(String productName) {
		
		WebElement name = getProductList().stream().filter(product->product.findElement(By.tagName("b")).getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
		return name;
	}
	

}
