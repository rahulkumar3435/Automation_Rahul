package OOPS;


	
	class bank {
		
		double ROI () {
			
			return 0.0;
		}
	}
class Axis extends bank {
		
		double ROI () {
			
			return 10.0;
		}
	}

class HDFC extends bank {
	
	double ROI () {
		
		return 11.0;
	}
}
	

    public class Overriding {
    	
	public static void main(String[] args) {
		
		bank B1 = new bank();
		Axis B2 = new Axis();
		HDFC B3 = new HDFC();
		
		System.out.println(B1.ROI());
		System.out.println(B2.ROI());
		System.out.println(B3.ROI());
		
		

	}

}
