package program_variables;

public class Program7 {

	public static void main(String[] args) {
		double d= 40.5; //8byte
		//int i=d; - error
		int i=(int)d; //typecast operator - no error 
		
		
		System.out.println((int)40.5); //no error - print statement type casting
		/*
		 Note : in Narrowing process data loss is present
		 */
		
		System.out.println(i);
		

	}

}
