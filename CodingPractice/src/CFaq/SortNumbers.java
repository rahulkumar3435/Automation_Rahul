package CFaq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		List <Integer> number=new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			System.out.println("enter "+i+" number");
			number.add(input.nextInt());
		}
		input.close();
		
		Collections.sort(number);
		System.out.println(number);

	}

}
