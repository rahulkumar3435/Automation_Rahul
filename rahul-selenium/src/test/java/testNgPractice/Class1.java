package testNgPractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("i am before test");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I am befor Method");
	}
	
	@Test(timeOut=4000, priority=0)
	
	public void method1() {
		
		System.out.println("method1");
	}
	
	@Test
	
	public void method2() {
		
		System.out.println("method2");
	}
}
