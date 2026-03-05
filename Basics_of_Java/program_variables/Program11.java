package program_variables;

public class Program11 {

	public static void main(String[] args) {
		byte b=(byte)129;
		System.out.println(b);
		
		int j=1_00_0;
		System.out.println(j); //irrespective of underscore it will print the no.
		
		int k=1_4;
		System.out.println(k); //irrespective of underscore it will print the no.
		
		/*
		 -127 to 128 
		 128 -> -128
		 129 ->-127
		 130 ->-126     (goes in a cyclic way)
		 
		 
		 */

	}

}
