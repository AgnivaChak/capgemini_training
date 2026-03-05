package oops.fundamentals.non_static;

public class Program2 {
	// instance variable or object variable
	int a;
	double d;
	byte b;
	String s;

	public static void main(String[] args) {
		int i=20;   //primitive
		i=30;
		i='A';
		Program2 obj1= new Program2(); // non primitive
		// Program2@659e0bfd -> output with some hexadecimal reference
		System.out.println(obj1);
		obj1=null;
		
		

	}

}