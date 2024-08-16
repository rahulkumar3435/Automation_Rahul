package FA_JavaProgram;

import java.util.HashSet;

public class DuplicateselementInArray1 {

	public static void main(String[] args) {
		
		String D[] = {"rahul","sonu","soni","tina","monu",};
		
		boolean status = true;
		
		HashSet <String> Dup = new HashSet();
		
		for (String x:D) {
			
			if(Dup.add(x)==false) {
				System.out.println("duplicate element found " +x);
				status = false;
			}
		}
		
		if (status==true) {
			System.out.println("duplicate element not found");
		}

	}

}
