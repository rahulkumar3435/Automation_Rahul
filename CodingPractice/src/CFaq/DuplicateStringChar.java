package CFaq;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a String");
		Scanner input= new Scanner(System.in);
		String str=input.nextLine().toLowerCase();
		
		Set <Character> charset=new HashSet<>();
		Set <Character> duplicateChar=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(!charset.add(str.charAt(i))) {
				duplicateChar.add(str.charAt(i));
			}
		}
		
        System.out.println(duplicateChar);
        input.close();
	}

}
