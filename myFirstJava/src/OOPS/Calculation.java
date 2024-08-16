package OOPS;

public class Calculation {

	
		
		int a;
		int b;
		int c;
		//Constructor
		public   Calculation(int a, int b, int c){  
			this.a = a;
			this.b = b;
			this.c = c;
				
		}
		
		public int Sum() {
			
			return (a+b+c);
		}
		
		
		public static void main(String[] args) {
			
			Calculation C1 = new Calculation(3,4,5);
			
			System.out.println(C1.Sum());
	}

}
