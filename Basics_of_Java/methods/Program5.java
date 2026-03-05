package methods;

public class Program5 {

	public static void main(String[] args) {
		num('A',16);      /* actual argument is not same, so the compiler will perform widening .
		                  if widening not possible then it will throw a compiler error
                          
                           --process of binding between method call statement and implementation of
                           the method during compilation is by the compiler 
                           based on actual argument
                           */
	}
	public static void num(int a, int b) {
		System.out.println("int,int");
	}
	public static void num(double a, double b) {
		System.out.println("double, double");
	}
	public static void num(char a, char b) {
		System.out.println("char, char");
	}
	public static void num(int a, char b) {
		System.out.println("int,char");
	}
	public static void num(char a, int b) {
		System.out.println("int,char");
	}

}