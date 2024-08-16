package OOPS;

public class CalcOverload {

	
		public int sum(int x, int y) {
			
			return(x+y);
		}
		
		public int sum (int x, int y, int z) {
			
			return(x+y+z);
		}
		
		 double sum(double x, double y) {
			
			return(x+y);
		}
		 double sum (double x,double y,double z){
			 
			 return(x+y+z);
		 }
		 
		 public static void main(String[] args) {
			CalcOverload Calc = new CalcOverload();
			
			System.out.println(Calc.sum(3, 4));
			System.out.println(Calc.sum(3, 4, 5));
			System.out.println(Calc.sum(3.4, 4.2));
			System.out.println(Calc.sum(3.4, 3.2, 5.1));
		}

	

}
  class wefdf{
	  
	  public static void main(String[] args) {
		System.out.println("dfd");
	}
	
}
