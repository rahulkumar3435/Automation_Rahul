package FA_JavaProgram;

import java.util.Scanner;

public class FactorialNumb {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = scan.nextInt();
    long Factorial = 1;
    
    for (int i=1;i<=a;i++) {
    	Factorial = Factorial * i;
    }
    System.out.println(Factorial + " is factorial of "+ a);
}
}


