package FA_JavaProgram;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,9};
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int x:A) {
			sum1 = sum1 + x;
		}
      for (int i = A[0];i<=A[A.length-1];i++) {
    	  
    	  sum2 = sum2 + i;
      }
      
     System.out.println("Missing number is " + (sum2-sum1));
	}
	

}
