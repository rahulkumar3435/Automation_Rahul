package CFaq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintReverseNumbers {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		List <Integer>numbers=new ArrayList<>();
		
		for (int i=0;i<5;i++) {
			System.out.println("enter nuber" +i);
			numbers.add(input.nextInt());
		}
		
		input.close();
		
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		
	}
		
		

	

}
