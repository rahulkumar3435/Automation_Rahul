package FA_JavaProgram;

public class MaxAndMinInArray {

	public static void main(String[] args) {
	 
		int A[] = {30,40,50,10,100,0,199};
		
		int max = A[0];
		int min = A[0];
		
		for (int x:A) {
			
			if (x>max) {
				max = x;
			}
			
			if (x<min) {
				min = x;
			}
		}
		
		System.out.println("Max is "+ max + " Min is "+ min);

	}

}
