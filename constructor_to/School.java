package constructor_to;

public class School {
	String name;
	int no_student;
	int no_class;
	
	
	public School(String name, int no_student, int no_class) {
		super();
		this.name = name;
		this.no_student = no_student;
		this.no_class = no_class;
	}


	public static void main (String[]args){
		
		School s1 = new School("VCK",765,10);
		System.out.println("Name of school :"+ s1.name);
		System.out.println("No of student present in school :"+ s1.no_student);
		System.out.println("No of class precent in school :"+ s1.no_class);


		
	}
	

}
