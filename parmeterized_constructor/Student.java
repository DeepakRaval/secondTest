package parmeterized_constructor;

public class Student {
	static String school_name = "New english school";
	
	public static void main (String[]args) {
		System.out.println("check in. parmeterized_constructor ");
		String name = "Deepak";
		String surname = "Raval";
		int roll_no = 65;
		
		school(name,surname,roll_no);
		
		
	}
	
	static void school(String a, String b, int c){
		System.out.println("School Name : "+ school_name);
		System.out.println("Student Name : "+a+" "+b);
		System.out.println("Student Roll no. : "+c);

		
	}

}
