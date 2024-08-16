package CodingNinjas;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array=12;
		int a=12344;
		
		DynamicArray arr1 = new DynamicArray();
		System.out.println(arr1.size());
		
		int k=0;
		while(k<21) {
			arr1.add(k);
			k++;
		}
		System.out.println(arr1.size());
		//arr1.print(14);23

	}
	

}
