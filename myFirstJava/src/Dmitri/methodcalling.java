package Dmitri;

public class methodcalling {
	public static void main (String []args) {
		hellorahul();
		nameage("rahul",33);
		
		
	}

	private static void hellorahul (){
		System.out.println("heeloRahul");
	}
	private static void nameage (String name, int age) {
		System.out.println(name + "is" + age + "yrs old");
		
	}

}

