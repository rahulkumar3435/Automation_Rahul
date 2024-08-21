package cdnjas;

import java.util.Scanner;

public class InsertionInArray {


	public static int[] insertion(int arr[], int size, int cap, int pos, int newelem){
		
			for (int i=size-1;i>=pos;i--) {
				
				arr[i+1]=arr[i];
			}
			arr[pos]= newelem;
			return arr;
			

	}
	
	public static int takeInput(String str) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(str);
		return input.nextInt();
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int cap = takeInput("Please enter capacity of array");
		int size = takeInput("Please enter size of Array");
		
		int arr1[] = new int[cap];
		
		for (int i=0;i<=size;i++) {
			
			arr1[i] = takeInput("enter element at "+i + "th position");
		}
		
		for (int x : arr1) {
			
			System.out.println(x);
		}
		
		int pos = takeInput("Enter position of element to be inserted");
		
		int newelem = takeInput("Enter new element to be entered");
		
		insertion(arr1,size,cap,pos,newelem);
		
		
		for (int x : arr1) {
			
			System.out.println(x);
		}
		
		Object arr[] = {1,"sfd",false};
		
		int a = (int)arr[0];
		

	}


}
