package FA_JavaProgram;

import java.util.Arrays;

public class SearchElementArrayBinary {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		
		int key = 12;
		boolean flag = true;
		
		int l =0;
		int h = A.length-1;
		
		
		while(l<h) {
			
			int m = (h+l)/2;
			
			if (key == A[m]) {
				System.out.println("Element found");
				flag = false;
				break;
			}
			else if (key>A[m]) {
				l = m+1;
			}
			else {
				h = m-1;
			}
		}
		if(flag)System.out.println("Element not found");
		
		//Short method to find element
		//System.out.println(Arrays.binarySearch(A, 2));
		

	}

}
