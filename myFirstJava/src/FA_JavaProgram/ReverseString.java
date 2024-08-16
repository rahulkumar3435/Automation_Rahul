package FA_JavaProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		
		String s = scan.nextLine();
		
		int l = s.length();
		String rev = "";
		
		for (int i = l-1;i>=0;i--) {
			
			 rev = rev + s.charAt(i);
		}
		System.out.println("your reversed string is "+rev);
		
		System.out.println("If you to check if you string is palindrome enter yes or no");
		
		String P = scan.nextLine();
		
		
		if(P.equalsIgnoreCase("yes")) {
			if (rev.equalsIgnoreCase(s)) {
				System.out.println("String is Palindrome");
			}else {
				System.out.println("String is not Palindrome");
			}
		}
		else if (P.equalsIgnoreCase("no")){
			
			System.out.println("Thanks ! Have a Good Day");
			}
			
			else {
				System.out.println("Invalid Input");
			}
		
		}
		
		
	}


