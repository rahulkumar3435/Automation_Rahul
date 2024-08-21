package CFaq;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintCharWithMaxFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="I am trying to learn hashmap collection in java hhhhhhhhhhhhhhhhhhhhhhhhhhh";
		
		Map <Character, Integer> mymap=new HashMap <>();
		
		for (int i=0;i<str1.length();i++) {
			
			if (mymap.containsKey(str1.charAt(i))) {
				
				mymap.put(str1.charAt(i), 1+mymap.get(str1.charAt(i)));
				
			}else {
				mymap.put(str1.charAt(i), 1);
			}
		}
		System.out.println(mymap);
		
		int CharMax= Integer.MIN_VALUE;
		char result='a';
		
		Set <Map.Entry<Character, Integer>> pair=mymap.entrySet();
		
		for (Map.Entry<Character, Integer> x: pair) {
			
			if (x.getValue()>CharMax) {
				CharMax=x.getValue();
				result=x.getKey();
			}
			
		}
		
		System.out.println(result);
		

	}

}
