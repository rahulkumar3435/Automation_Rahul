package FA_JavaProgram;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		 
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int max = input.nextInt();
		for(int i=0;i<=max;i++) {
		int k =0;	
		int a = i;
		int orgNumb=i;
		while (a>0)
		{
			int j= a%10;
			//int k=0;
			 k = j*j*j +k;
			 a=a/10;
			
			
		}
		
		if (orgNumb==k)
		{
			System.out.println(orgNumb +" is a Armstrong Number");
		}
		}
     
	}

}
