package CFaq;

class Bank1 {
	int b;
	int c;
	Bank1(){
		System.out.println("I am from Bank Class");
	}
	
	Bank1(String x){
		System.out.println("I am from Bank Class"+ x);
	}
	
}
class ChildBank extends Bank1 {
	
	ChildBank(){
		super("rahul");
		System.out.println("I am from Child Bank");
	}
	
	ChildBank(int a, int b){
		super("rahul");
		System.out.println("I am from Child Bank"+a+b);
	}
	
}

class GrandChildBank extends ChildBank{
	
	GrandChildBank(){
		
		System.out.println("I am from GrandChildBank");
	}
	GrandChildBank(int x,int y){
		
		super(3,4);
		System.out.println("I am from GrandChildBank"+x+""+y);
	}
	
}
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank1 b1=new Bank1();
		//ChildBank b2=new ChildBank();
		GrandChildBank b3=new GrandChildBank();
		

	}

}
