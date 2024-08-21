package cdnjas;

// reverse an array using two pinter approach and normal approach


public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		
		// using normal method
		int j=arr1.length - 1;
		for (int i =0;i<arr1.length/2;i++) {
			
			int temp=arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
			j--;
		}
		for (int x : arr1) {
			
			System.out.print(x + " ");
		}
		
		// using 2pointer approach
		// if we want to reverse subarray then set l & r to 
		//index from where we want to reverse 
		
		int l=0;
		int r=arr1.length - 1;
		
		while (l<r) {
			int temp = arr1[l];
			arr1[l] = arr1[r];
			arr1[r] = temp;
			l++;
			r--;
		}
		
		for (int x : arr1) {
			
			System.out.print(x + " ");
		}

	}

}
