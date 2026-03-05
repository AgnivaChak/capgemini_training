package methods;

public class Program4 {

	public static void main(String[] args) {
		//method overloading-> multiple method with same name
		/*Rules
		 1. method should have same name, but formal argument should change like length, type, 
		 order of declaration.
		 */
		System.out.println(num(10,20));
		System.out.println(num(10,20,30));

	}
	public static int num(int a, int b) {
		return a+b;
	}
	public static int num(int a, int b, int c) {
		return a+b+c;
	}

}