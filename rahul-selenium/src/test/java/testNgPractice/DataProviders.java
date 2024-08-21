package testNgPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider
	
	public String[][] getData() {
		
		String obj [][] = new String [3][2];
		
		obj[0][0] = "firstrowfirstcol";
		obj[0][1] = "firstrowsecondcol";
		
		return obj;
		
	}
	
	@Test(dataProvider="getData")
	
	public void test(String first, String second ) {
		
		System.out.println(first);
		System.out.println(second);
		
		
	}
	

}
