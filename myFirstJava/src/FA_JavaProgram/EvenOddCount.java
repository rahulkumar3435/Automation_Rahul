package FA_JavaProgram;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int N = scan.nextInt();
		
		int Even = 0;
		int Odd = 0;
		
		while (N!=0) {
			
			int R = N%10;
	
			if (R%2==0) {
				Even++;
			}
			else {
				Odd++;
			}
			N = N/10;
		}
		
		System.out.println("Number of Even and Odd digits "+Even + " "+Odd);

	}

}
