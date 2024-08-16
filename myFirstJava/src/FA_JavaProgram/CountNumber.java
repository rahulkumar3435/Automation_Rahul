package FA_JavaProgram;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int a = scan.nextInt();
		int i = 0;
		
		while (a!=0) {
			a = a/10;
			i++;
		}
		
     System.out.println("Number of digits is "+i);
	}

}
