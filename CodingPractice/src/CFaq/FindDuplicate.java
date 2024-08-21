package CFaq;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicate {
	
	public static void PrintDuplicate(List<Integer> My) {
		Set <Integer> myset=new HashSet<>();
		for (Integer x : My) {
			
			if (!myset.add(x)) {
				
				System.out.println(x + " is duplicate");
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		List <Integer> mylist= new ArrayList<>();
		
		for (int i=0;i<6;i++) {
			System.out.println("enter "+i+"st number");
			mylist.add(input.nextInt());
		}
		
		input.close();
		
		PrintDuplicate(mylist);

	}

}
