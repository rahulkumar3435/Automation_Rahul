package FA_JavaProgram;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {3,4,5,6,7,7,2};
		
		int sum = 0;
		
		for (int x:a) {
			sum = sum + x;
		}
		
		System.out.println("Sum of all the elements of array is "+ sum);
	}
	
}
