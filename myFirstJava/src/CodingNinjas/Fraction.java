package CodingNinjas;

public class Fraction {
	private int numerator;
	private int denominator;
	private static int count=0;
	
	Fraction(int numerator,int denominator){
		if (denominator==0) {
		
			System.out.println("Plz enter valid fraction");
			
		}
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();
		count++;
	}
	Fraction(){
		this.numerator=1;
		this.denominator=1;
		count++;
		print();
	}
	public void simplify() 
	{
		int gcd=1;
		int i= Math.min(denominator, numerator);
		int j=1;
		while(j<=i)
		{
			if(denominator%j==0 && numerator%j==0) {
				gcd=j;
			
			}
			j++;
		}
		numerator= numerator/gcd;
		denominator=denominator/gcd;
		//print();
	}
	
	public void print()
	{
		System.out.println(numerator + "/" + denominator);
	}
	public void increment()
	{
		
		numerator = numerator + denominator;
		print();
	}
	public static void Number() {
		System.out.println("no of fraction object created " + count);
	}
	public static Fraction add(Fraction f1, Fraction f2) {
		Fraction f3=new Fraction(1,1);
		f3.numerator=f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		f3.denominator=f1.denominator*f2.denominator;
		f3.simplify();
		return f3;
		
	}
	public void addorignal(Fraction f1) {
		numerator=f1.numerator*denominator + f1.denominator*numerator;
		denominator=f1.denominator*denominator;
		simplify();
		
	}

}
