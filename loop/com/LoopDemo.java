package loop.com;

public class LoopDemo {
	static String [] names_array = {"I","N","D","I","A"};
	
	
	
	public static void main(String[]arg){
		
	for_loop();
	while_loop();
	do_while_loop();
	
	}
	// example of For loop
	static void for_loop(){
		System.out.println("** For_Loop.in **");
		for (int i = 0; i < 5; i++){
		  System.out.println("This is "+(i+1));
		}
		System.out.println("** For_loop . out ** \n");
	}
	// Example of While loop
	static void while_loop(){
		System.out.println("** While loop.in**");
		System.out.println("This is");
		int i = 0;
		while(i< names_array.length){
			System.out.println(names_array[i]);
			i++;
		}
		System.out.println("**While loop.out** \n");
	}
	// Example of Do_While loop
	static void do_while_loop(){
		System.out.println("**While loop.in**");
		int i = 0;
		do{
			System.out.println("its "+i);
			i++;
		}while(i<6);
		System.out.println("**While loop.out**");
		
	}

}

