package cdnjas;

// Push all the zeroes at the end in array using 2Pointer approach

public class PutZeroesAtEnd {
	
	public static void swap(int arr1[], int i, int j) {
	
		int temp = arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,0,4,0,4,7,9,11,0,2,0};
		
		int n = A.length;
		int z = 0;
		int nz = 0;
		
		while(z<n && nz<n) {
			
			if (A[z]!=0) {
				swap(A,z,nz);
				nz++;
			}
			z++;
		}
		
		for (int x : A) {
			
			System.out.print(x + " ");
		}

	}

}
