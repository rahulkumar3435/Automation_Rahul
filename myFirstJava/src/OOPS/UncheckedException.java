package OOPS;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("your code is started");
		
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
		int i = 0;
		String S6 = "1234";
		
		try
		{
		int A1 = Integer.parseInt(S6);
		System.out.println(i/0);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception is handled");
			e.printStackTrace();
			
		}
		finally
		{
			System.out.println("finally will execute each time");
		}
		
//		String S = "abcd";
//		
//		try
//		{
//			int A = Integer.parseInt(S);
//		}
//		catch(NumberFormatException q)
//		{
//			System.out.println("exception is handled");
//			q.printStackTrace();
//		}
		System.out.println("your code is completed");
	}

}
