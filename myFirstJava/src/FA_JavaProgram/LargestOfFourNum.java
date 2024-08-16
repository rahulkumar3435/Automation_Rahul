package FA_JavaProgram;

import java.util.Scanner;

public class LargestOfFourNum {
	
	public static void main(String args[]) {
		int a, b, c, d;
	
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter first number");
    a = scan.nextInt();
    System.out.println("Enter second number");
    b=scan.nextInt();
    System.out.println("Enter third number");
    c=scan.nextInt();
    System.out.println("Enter fourth number");
    d=scan.nextInt();
    
    int largest = (c>d?c:d)>(a>b?a:b)?(c>d?c:d):(a>b?a:b);//ternary operator
    System.out.println(largest + " is the largest number");

}
	}

