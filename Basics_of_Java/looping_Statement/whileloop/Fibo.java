package looping_Statement.whileloop;

public class Fibo {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;

		System.out.println(a); // 0
		System.out.println(b); // 1

		int z = 1;

		while (z < 10) {
		    int c = a + b;  // next Fibonacci number
		    a = b;
		    b = c;
		    z++;
		    System.out.println(c);
		}

	}

}
