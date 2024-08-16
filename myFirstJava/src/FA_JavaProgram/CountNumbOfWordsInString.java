package FA_JavaProgram;

import java.util.Scanner;

public class CountNumbOfWordsInString {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String S = scan.nextLine();
		
		int count = 1;
		
		for (int i = 0;i<S.length()-1;i++) {
			
			if (S.charAt(i)==' ' && S.charAt(i+1)!=' ') {
				
				count++;
			}
		}
		
		System.out.println("No of words is "+ count);

	}

}
