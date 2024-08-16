package javaimpques;

public class ObjectCreation {

	
		// TODO Auto-generated method stub
	 public static void main (String args[])
		{
		UseObject S1=new UseObject();	
		S1.display();
		}

		
	}

 class UseObject{
	
	String sName;
	int rollnm;
	UseObject(int rollnm)
	{
		
		this.rollnm=rollnm;
	}
	UseObject()
	{
		System.out.println("fuck");
	}
	
	
	void display() {
		int r=6;
	System.out.println(sName + rollnm +r);
	}
}


