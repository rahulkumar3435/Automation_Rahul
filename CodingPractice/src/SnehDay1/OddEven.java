package SnehDay1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner (System.in);
		System.out.println("Please enter a number");
		int number=input.nextInt();
		input.close();
		
		if (number%2==0) {
			System.out.println(number + " is even number");
			
		}else {
			
			System.out.println(number + " is odd number");
		}
		

	

	}

}
