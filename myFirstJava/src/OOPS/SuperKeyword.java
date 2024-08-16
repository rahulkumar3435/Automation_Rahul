package OOPS;

class Animal 
{
	String color = "White";

  void eat ()
  {
	  System.out.println("eating");
  }
}
  
      class Dog extends Animal
      {
    	  String color = "Black";
    	  
    	  void eat ()
    	  {
    		  System.out.println("eating bread");
    		  super.eat();
    	  }
    	   void display()
    	   {
    		   System.out.println(super.color);
    	   }
    	  
    	   
      }
public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
	    System.out.println(d.color);
	    d.eat();
	    d.display();
	    
	    
	    
	    

	}

}

