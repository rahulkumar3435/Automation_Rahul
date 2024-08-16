package FA_JavaProgram;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int A[] = {5,3,2,4,1};
		
		System.out.println("Array before Sorting " + Arrays.toString(A));
		
		int n = A.length;
		
		for (int i = 0;i<n-1;i++) {
			 
			for(int j = 0;j<n-1;j++) {
				
				if(A[j]>A[j+1]) {
					
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array after Sorting " + Arrays.toString(A));
		
		

	}

}
