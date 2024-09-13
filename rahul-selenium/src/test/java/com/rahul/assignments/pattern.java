package com.rahul.assignments;

public class pattern {
	
	 static int a= 10;
	 static int b = 30;
	 static String gh = "dfsdf";
	 String s="fgdf";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		
		for (int i=0;i<=10;i++) {
			
			for (int k=0;k<i;k++) {
				
				System.out.print(" ");
			}
			
			for (int j=10-i;j>0;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

	}
	
	public void m1() {
		
		System.out.println(a);
	}

}
