package OOPS;

public class DataConversion {

	public static void main(String[] args) {
		
		//string to integer
		    String S1 = "10";
		    String S2 = "30";
		    
		    System.out.println(S1 + S2);
		    
		   int S3 =  Integer.parseInt(S1);
		    int S4 = Integer.parseInt(S2);
		    
		    System.out.println(S3 + S4);
		    
		    //string to double
		    
		    String D1 = "10.55";
		    String D2 = "33.99";
		    
		    double D3 = Double.parseDouble(D1);
		    double D4 = Double.parseDouble(D2);
		    
		    System.out.println(D1 + D2);
		    System.out.println(D3 + D4);
		    
		    //string to boolean
		    
		    String F1 = "true";
		    boolean B1 = Boolean.valueOf(F1);
		    
		    int a = 4;
		    char c = 'R';
		    
		    String A = String.valueOf(a);
		    
		    

	}

}
