package W3practice;

import java.util.Scanner;

public class Divide2number {
	public static void main (String[]args) {
	/*int a= 50;
	int b= 2;
	int divide= 9/3 + a/b;
	System.out.println(divide);*/
		
		Scanner input = new Scanner (System.in);
	    System.out.print("Input the first number: ");
	    int a = input.nextInt();
	    System.out.print("Input the second number: ");
	    int b = input.nextInt();
	    int d = (a/b);
	    System.out.println();
	    System.out.println("The division of a and b is:" +d);
	
	}

}
