package CFaq;

public class PassByValue {
	
	public static void change(Integer a) {
		
		a=4;
	}
	
	public static void sum(int a, double b) {
		
		//return a+b;
	}
	
	public static void sum (double a, int b) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a= 6;
		change(a);
		System.out.println(a);
		
		
	}

}
