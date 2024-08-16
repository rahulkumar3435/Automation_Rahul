package FA_JavaProgram;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number");
	    int a = scan.nextInt();
	    int count = 0;
	    if (a>1) {
	    for (int i =1;i<=a;i++) {
	    	if(a%i==0) {
	    		count++;
	    	}
	    }
	    if (count==2) {
	    	System.out.println(a + " is prime");
	    }else System.out.println(a + " is not a prime");
	    }
	    else System.out.println(a + " is not a prime");
	}

}
