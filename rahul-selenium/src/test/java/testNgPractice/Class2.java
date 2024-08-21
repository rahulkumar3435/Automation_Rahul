package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@AfterTest
	public void after() {
		System.out.println("I am after test");
	}
	
	@Test(priority=1)
	public void login() {
		
		System.out.println("login");
		Assert.assertTrue(false);
	}
	
	@Test(priority=2)
	public void search() {
		
		System.out.println("search");
	}
	
	@Test(priority=0)
	public void title() {
		
		System.out.println("title");
	}

}
