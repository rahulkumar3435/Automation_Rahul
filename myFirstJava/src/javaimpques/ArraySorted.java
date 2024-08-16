package javaimpques;

public class ArraySorted {

	public static void main(String[] args) {
		
		int A [] = {1,2,10,4,9,6,7};
		boolean flag=true;
		
		for(int i=0;i<A.length-1;i++)
		{
			if(!(A[i]<=A[i+1]))
			{
				System.out.println("Array is not sorted");
				flag=false;
				break;
			}
			
		}
		
		if(flag)System.out.println("Array is sorted");

	}

}
