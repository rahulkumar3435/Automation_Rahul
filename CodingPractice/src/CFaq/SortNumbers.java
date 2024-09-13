package CFaq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a =10;
		int b = a;
		Integer c =b;
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
