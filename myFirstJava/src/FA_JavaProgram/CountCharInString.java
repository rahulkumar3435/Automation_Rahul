package FA_JavaProgram;

import java.util.Scanner;

public class CountCharInString {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String S = scan.nextLine();
		
		System.out.println("Enter char to be counted");
		
		String C = scan.nextLine();
		
		
		int L1 = S.length();
		
		int L2 = S.replace(C, "").length();
		
		System.out.println("Count of "+ C + " in String " + "(" + S +")" + " is " + (L1-L2));

	}

}
