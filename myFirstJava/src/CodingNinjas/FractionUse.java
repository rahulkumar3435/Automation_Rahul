package CodingNinjas;

public class FractionUse {

	public static void main(String[] args) {

		Fraction f1=new Fraction(18,16);
		f1.print();
		f1.increment();
		Fraction f2=new Fraction(2,3);
		Fraction.add(f1, f2).print();
		f1.addorignal(f1);
		f1.print();
			

	}

}
