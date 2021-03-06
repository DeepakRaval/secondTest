package custum_constructor;

public class Company {
	static String name = "xyz tech";
	
	public static void main (String[]args){
		
		System.out.println(name);
	 String emp_name = "ABC";
	 int id = 76876;
	 int salary = 76974;
	 
	 employee(emp_name, id, salary);
	 
	 int month1 = 26;
	 int month2 = 29;
	int final_presenty = presenty(month1, month2);
	
	System.out.println("presenty  = "+ final_presenty);
	 
	}
	
	static void employee(String a, int b, int c){
		System.out.println("Employee name : "+a);
		System.out.println("Employee Id : "+b);
		System.out.println("Employee salary : "+c);

	}
	
	static int presenty(int x, int y){
		int total = x + y;
		post("Front End Developer");
		return total;
		
		
		
	}
	
	static void post(String s1){
		System.out.println("The post of Employee :"+s1);
		
	}
	

}
