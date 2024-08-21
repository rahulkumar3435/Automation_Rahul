package CFaq;


class Animal1 {
	int legs;
	int teeths;
}

class Dog extends Animal1{
	boolean Isvegeterian;
	String color;
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1=new Dog();
	  d1.legs=4;
	  d1.teeths=56;
	  d1.Isvegeterian=false;
	  d1.color="black";
	  
	  

	}

}
