package CodingNinjas;

public class DynamicArray {
	
	private int data[];
	private int nextelementindex;
	
	DynamicArray(){
		data = new int[5];
		nextelementindex=0;
		
	}
	
	public int get(int i) {
		return data [i];
	}
	
	public int size() {
		return data.length;
	}
	
	public boolean IsEmpty() {
		return nextelementindex==0;
	}
	
	public void add (int elem) {
		if (nextelementindex==data.length) {
			doubleCapacity();
		}
		data [nextelementindex]= elem;
		nextelementindex++;
	}
	
	private void doubleCapacity() {
		int temp[]= data;
		data = new int[2*temp.length];
		int i=0;
		while(i<temp.length) {
			data [i]=temp[i];
			i++;
		}
		}
	public void print (int i) {
		System.out.println(data[i]);
	}

	


	

}
