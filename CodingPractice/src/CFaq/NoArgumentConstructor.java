package CFaq;

import java.util.ArrayList;
import java.util.List;

class Animal{
	 int legs;
	 boolean Isvegeterian;
	 int teeths;
	 static int numberOfAnimal=0;
	 
	  Animal(int legs,int teeths,boolean Isvegeterian){
		  this.legs=legs;
		  this.teeths=teeths;
		  this.Isvegeterian=Isvegeterian;
		 numberOfAnimal++;
	 }
	 
	 public void Print(){
		 
		 System.out.println("number of legs "+ legs);
		 System.out.println("number of teeths "+ teeths);
		 if(Isvegeterian) {
			 System.out.println("Vegeterian");
		 }else {
			 System.out.println("Non Vegeterian");
			 
		 }
	 }
	 
 }
public class NoArgumentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Animal Cow=new Animal(2,26,true);
      Cow.legs=4;
      Cow.teeths=29;
      Cow.Isvegeterian=true;
      Animal Dog=new Animal(4,36,false);
      Animal Lion=new Animal(4,56,false);
      Animal Zebra=new Animal(6,78,true);
      
      List <Animal> listOfAnimal= new ArrayList<>();
      
      //Object list[]= new Object[5];
      listOfAnimal.add(Cow);
      listOfAnimal.add(Lion);
      listOfAnimal.add(Dog);
	  listOfAnimal.add(Zebra);
	  //list[0]=Cow;
	  System.out.println(Animal.numberOfAnimal);
	  
	  for (Animal x: listOfAnimal) {
		  
		  x.Print();
		  
	  }
	  
	  
	}

}
