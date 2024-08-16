package FA_JavaProgram;

public class TwoArrayEquality {

	public static void main(String[] args) {
		
		int A1[] = {1,2,3,4,5};
		int A2[] = {1,2,3,4,5};
		
		boolean status = true;
		
		if (A1.length==A2.length) {
			
			for(int i = 0;i<A1.length;i++) {
				
				if(A1[i]!=A2[i]) {
					status = false;
				}
			}
		}
		else {
			status = false;
		}
		
		if (status == true) {
			System.out.println("Arrays are equal");
		}else{
			System.out.println("Arrays are not equal");
		}

	}

}
