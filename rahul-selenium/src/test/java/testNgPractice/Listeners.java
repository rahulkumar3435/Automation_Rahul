package testNgPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	 public void onTestStart(ITestResult result) {
		    // not implemented
		 System.out.println("I am from listener fron test start");
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		 System.out.println("I am from listener fron test sucess");
		  }
	 
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		 System.out.println("I am from listener fron test fail");
		  }
	

}
