package CFaq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a string");
		Scanner input=new Scanner(System.in);
		String str= input.nextLine().toLowerCase();
		
		input.close();
		
		Map <Character, Integer> mymap=new HashMap<>();
		
		for (int i=0;i<str.length();i++){
			
			if(mymap.containsKey(str.charAt(i))) {
				
				mymap.put(str.charAt(i), mymap.get(str.charAt(i))+1);
			
			}else {
				
				mymap.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(mymap);

	}

}
