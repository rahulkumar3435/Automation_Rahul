package W3practice;

import java.util.Scanner;

public class Frequncy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String S=input.nextLine();
		input.close();
		
		String R="";
		
		for (int i=0;i<26;i++)
		{
			int count=0;
			char x=(char) ('a'+i);
			for (int j=0;j<S.length();j++)
			{
			if(S.charAt(j)==x) {
				count++;
			}
			}
			if (count!=0) {
				R=R + x+count;
			}
			
		}
		System.out.println(R);

	}

}
