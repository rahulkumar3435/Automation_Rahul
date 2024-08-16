package FA_JavaProgram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
	
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = scan.nextInt();
    System.out.println("Enter second number");
    int b =scan.nextInt();
    
    int sum = 0;
    
    for (int i = 0;i<10;i++) {
    	sum = a + b;
    	System.out.println(sum);
    	a=b;
    	b=sum;
    }

}
	}
