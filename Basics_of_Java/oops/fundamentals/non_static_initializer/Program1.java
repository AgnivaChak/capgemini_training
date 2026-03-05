package oops.fundamentals.non_static_initializer;

public class Program1 {
	static {
		System.out.println("static block 1");
	}
	//non-static initializer 
	{
		System.out.println("non static block 3");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		new Program1();
		new Program1();
		new Program1();
		new Program1();

	}
	static {
		System.out.println("static block 2");
	}

}
