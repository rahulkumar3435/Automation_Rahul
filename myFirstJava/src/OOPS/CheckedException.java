package OOPS;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("your code is started");
		
		Thread.sleep(5000);
		
		String S1 = null;
		
		try
		{
				S1.length();
		}
	 catch(NullPointerException w)
	 {
		 System.out.println("exception is handled");
		 w.printStackTrace();
		 
	 }
		
		
		System.out.println("your code is completed");

	}

}
