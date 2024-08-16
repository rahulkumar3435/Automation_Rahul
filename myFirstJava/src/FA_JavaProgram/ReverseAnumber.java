package FA_JavaProgram;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		
		int a;
		int rev;
		int s;
		
		System.out.println("Please Provide a number ");
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		
		int O = a;
		
		rev = 0;
		
		while (a!=0){
		
	 rev = rev*10 + a%10;
	 a = a/10;
	 
	 //System.out.println("your number is reversing");
		}
	
		System.out.println("your reversed number is "+ rev);
		
		System.out.println("Do you want to check if this number is palindrome then enter 0 otherwise enter 1");
		
		
		s = input.nextInt();
	
		
		if(s==0) {
			if (rev==O) {
				System.out.println("Number is Palindrome");
			}else {
				System.out.println("Number is not Palindrome");
			
			}
		}
		else if (s==1) {
			System.out.println("thanks");
		}
		else {
			System.out.println("Invalid Input");
		}
			

	}

}
