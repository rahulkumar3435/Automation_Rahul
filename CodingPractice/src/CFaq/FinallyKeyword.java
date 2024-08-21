package CFaq;

public class FinallyKeyword {
	
	public static int divide(int a, int b) {
		
		try{
			return a/b;
		}
		catch (Exception e) {
			System.out.println("this is generic exception");
		}
		finally {
			System.out.println("this is clean up");
		}
		System.out.println("gfgu");
		
		return -1;
       
	}
	
//	public static int factorial(int n) {
//		
//		try {
//			int factorial=1;
//		for (int i=n;i>0;i--) {
//			
//			factorial = factorial * i;
//			
//		}
//		return factorial;
//		}
		
		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//System.out.println(divide(4,0));
		try {
			for (int i=1;i<5;i++) {
				
			}
		}

	}

}
