package SnehDay1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]= {1,2,3,3,4,4,5,10,19,20,46,33,33,19};
		
		Set <Integer>myset=new HashSet <>();
		List <Integer> duplicate=new ArrayList<>();
		
		for (int x:number) {
			
			if (!myset.add(x)) {
				duplicate.add(x);
			} else {
				myset.add(x);
			}
		}
		
       System.out.print(duplicate);
	
	}
}
