package FA_JavaProgram;

import java.util.Scanner;

public class twonumberswap{
	

	public static void main (String args[]) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("please enter number 1");
		
		int a = data.nextInt();

		System.out.println("please enter number 2");
		
		int b = data.nextInt();
		
		System.out.println("your input number is "+"a = "+a);
		System.out.println();
		System.out.println("your input number is "+"b = "+b);
		
		int c;
		
		c = a+b;
		a = c-a;
		b = c-a;
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("your swapped number is "+"a = "+a);
		System.out.println();
		System.out.println("your swapped number is "+"b = "+b);
				
	 
	 
 }
}