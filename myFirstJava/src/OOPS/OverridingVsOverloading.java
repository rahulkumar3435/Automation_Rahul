package OOPS;

class ABC {
	
	void m1 (int a) {
		
		System.out.println(a);
	}
	
	void m2 (int b) {
		System.out.println(b+b);
	}
}

class XYZ extends ABC {
	
	void m1 (int a) {
		System.out.println(a*a);   //overrided
	}
	
	void m2(int b, int c) {
		System.out.println(b+c);  //overloaded
		
	}
}

// total 3 method in class XYZ
public class OverridingVsOverloading {

	public static void main(String[] args) {
		
		XYZ O = new XYZ();
		
		O.m1(4);
		O.m2(5);
		O.m2(5, 7);

	}

}
