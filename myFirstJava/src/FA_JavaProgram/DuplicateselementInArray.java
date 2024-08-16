package FA_JavaProgram;

public class DuplicateselementInArray {

	public static void main(String[] args) {
		
		String D[] = {"rahul","sonu","soni","tina","monu","soni","Monu"};
		
		boolean status = false;
		
		for (int i = 0;i<D.length;i++) {
			
			for (int j = i+1;j<D.length;j++) {
				
				if(D[i] == D[j]) {
					System.out.println("duplicate element found "+ D[i]);
					status = true;
				}
				
			}
			
			
		}
		if(status==false)System.out.println("duplicate element not found");
		
		
	}

}
