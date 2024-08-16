package OOPS;

public class StudentClass {
	
	int SID;
	String Sname;
	int Sub1, Sub2, Sub3;
	
	public void getStuData(int SID,String Sname) {
		
		this.SID = SID;
		this.Sname = Sname;
		
	}
	
	public void getStuMarks(int a, int b, int c) {
		
		Sub1 = a;
		Sub2 = b;
		Sub3 = c;
	}
	
	public void totalMarks () {
		
		System.out.println("Student Name is " + Sname);
		System.out.println("Student Id is " + SID);
		System.out.println("Student total marks is " + (Sub1+Sub2+Sub3));
	}

	public static void main(String[] args) {
		
		StudentClass S1 = new StudentClass();
		StudentClass S2 = new StudentClass();
		StudentClass S3 = new StudentClass();
		
		S1.getStuData(1234, "Rahul");
		S2.getStuData(5678, "Sonu");
		S3.getStuData(3456, "Soni");
		
		S1.getStuMarks(30, 40, 50);
		S2.getStuMarks(10, 20, 20);
		S3.getStuMarks(50, 60, 2);
		
		S1.totalMarks();
		S2.totalMarks();
		S3.totalMarks();
		

	}

}
