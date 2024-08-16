package OOPS;

import OOPS.StaticKeyword;

public class Teacher {
	
	String designation = "teacher";
	String collegeName = "BusyQA";
	
	void does() {
		
		System.out.println("teaching");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(StaticKeyword.b);
		
		
	}

}

class Computerteacher extends Teacher{
	
	
}
