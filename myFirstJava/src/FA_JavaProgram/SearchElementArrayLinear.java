 package FA_JavaProgram;

public class SearchElementArrayLinear {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5};
		
		int search_ele = 4;
		
		boolean flag = false;
		
		for (int i = 0;i<A.length;i++) {
			
			if (A[i]== search_ele) {
				System.out.println("Search element is at "+ i);
				flag = true;
			}
		}
		if(flag==false)System.out.println("Search element not found");

	}

}
