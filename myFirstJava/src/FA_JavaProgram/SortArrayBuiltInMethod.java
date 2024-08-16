package FA_JavaProgram;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayBuiltInMethod {

	public static void main(String[] args) {
		
                  int A[] = {5,3,2,4,1};
		
		System.out.println("Array before Sorting " + Arrays.toString(A));
		
		Arrays.parallelSort(A);
		
		System.out.println("Array after Sorting " + Arrays.toString(A));
		
	      int B[] = {60,40,30,90,100};
			
			System.out.println("Array before Sorting " + Arrays.toString(B));
			
			Arrays.sort(B);
			
			System.out.println("Array after Sorting " + Arrays.toString(B));
			
			 Integer C[] = {10,50,20,90,100};
				
				System.out.println("Array before Sorting " + Arrays.toString(C));
				
				Arrays.sort(C,Collections.reverseOrder());
				
		System.out.println("Array after Sorting " + Arrays.toString(C));
		
	}
	

}
