package CFaq;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="This is my collection nnnn eee";
		
		Set <Character> myset=new HashSet<>();
		Set <Character> duplicate=new HashSet<>();
		
		for (int i=0;i<str1.length();i++) {
			
			if (!myset.add(str1.charAt(i))) {
				duplicate.add(str1.charAt(i));
			}
		}
       
		myset.removeAll(duplicate);
		System.out.println(myset);
	}

}
