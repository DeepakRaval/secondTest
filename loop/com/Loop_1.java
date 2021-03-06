package loop.com;

public class Loop_1 {
	// static String [] names_array = {"Indrajeet","Nitin","Deepak","Ishwar","Aditye"};
	static String[] names_array = { "I ", "want ", "to ", "go " };
	static int[] x = { 11 , 22 , 33 , 44 };

	public static void main(String[] args) {
		System.out.println("** For_Loop.in **");

		for (int i = 0; i < names_array.length; i++) {

			System.out.print(names_array[i] + " ");// ln is used to print at new line
		}

		/*
		 * ****************************************** Example of printing string in one line
		 */

		String str_final = ""; // null; ----> local variable require Initialization and to avoid null printing v have given ("")

		for (int i = 0; i < names_array.length; i++) {

			str_final = str_final + names_array[i];

		}
		System.out.println(str_final); // sysout.err.print(0)--- > gives the error in the red color.

		/*
		 * ************************************************************ For_each Loop
		 this is trial testing for watching change at git hub by using git comand
		 */
		
		// Commonly used for loop to execute whole array at one time

		// collection set = receiving point/array
		for (String my_string : names_array) {
			System.out.print(my_string);

		}

		for (int y : x) {
			System.out.print(y +" ");
		}

	}
}
/*
 * unrechable codee --> error = check comprison condition every time to avoid
 * this type of error
 * 
 * debug--> prespective
 * 
 * 
 * 
 * 
 */
