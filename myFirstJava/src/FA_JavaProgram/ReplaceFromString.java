package FA_JavaProgram;

public class ReplaceFromString {
	
	public static void main(String[] args) {
		
		String str = "!#$#%^&*() asdj d$c^G8G7H$^%&*hjkhhjg jhg jhg";
		
		System.out.println("Before removing "+ str);
		
		String S = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("After removing "+ S);
		
		String X = "  ja  va  is   mu st for   lear  ning   automatio  n";
		
		System.out.println("Before removing "+ X);
		
		X = X.replaceAll("\\s", "");
		
		System.out.println("After removing "+ X);
		
		
		
		
	}

}
