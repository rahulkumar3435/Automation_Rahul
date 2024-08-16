package OOPS;


	
	class parent {
		
		void disp(int a) {
			
			System.out.println(a);
		}
	}
	
	class child1 extends parent {
		
		void show (int b) {
			
			System.out.println(b);
		}
	}
	
	class child2 extends parent {
		
		void print (int c) {
			
			System.out.println(c);
		}
	}
	
	public class HierarchyInheritance {

	public static void main(String[] args) {
	
		child1 c1 = new child1();
		child2 c2 = new child2();
		
		c1.disp(5);
		c1.show(55);
		c2.print(556);
		c2.disp(45);
		

	}

}
