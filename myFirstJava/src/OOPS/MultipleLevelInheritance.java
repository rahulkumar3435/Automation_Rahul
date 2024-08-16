package OOPS;


	class D {
		
		int a = 10;
		void dis () {
			
			System.out.println("from class A");
		}
	}

	class E extends D {
		
		int b = 30;
		void disp () {
			
			System.out.println("from class B");
		}
	}
	class C extends E {
		
		int c = 90;
		
		void sum () {
			
			System.out.println(a+b+c);
		}
	}
	
	public class MultipleLevelInheritance {


	public static void main(String[] args) {
		
		C coo = new C();
		
		System.out.println(coo.a);
		System.out.println(coo.b);
		System.out.println(coo.c);
		coo.dis();
		coo.disp();
		coo.sum();
		

	}

}
