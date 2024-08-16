package FA_JavaProgram;

public class PrintEvenODDArray {

	public static void main (String args[]) {
		
		int A[] = {1,2,3,4,5,6,7,8};
		
		for (int x:A) {
			
			if(x%2==0) {
				System.out.println(x + " is even number");
			}
			else {
				System.out.println(x + " is odd number");
			}
		}
	}
}
