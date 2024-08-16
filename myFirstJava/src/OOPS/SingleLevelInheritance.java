package OOPS;

class A {
	
	int a = 10;
	void dis () {
		
		System.out.println("from class A");
	}
}

class B extends A {
	
	int b = 30;
	void disp () {
		
		System.out.println(" from class B");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		B boo = new B();
		
		System.out.println(boo.a);
		System.out.println(boo.b);
	    boo.dis();
	    boo.disp();

	}

}
