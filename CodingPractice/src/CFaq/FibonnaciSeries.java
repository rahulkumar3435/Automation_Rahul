package CFaq;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		
		for (int i=0;i<10;i++) {
			
			int temp=b;
			System.out.println(a+b);
			b=a+b;
			a=temp;
		}

	}

}
