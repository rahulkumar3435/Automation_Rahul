package FA_JavaProgram;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int N = scan.nextInt();
		
		int sum =0;
		
		while (N!=0) {
			 sum = sum + N%10;
			N = N/10;
		}
		
		System.out.println("Sum of digits is "+sum);

	}

}
