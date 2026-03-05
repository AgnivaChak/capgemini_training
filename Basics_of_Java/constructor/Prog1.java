package constructor;

//execution order check 

public class Prog1 {

	static {
		System.out.println("static block 1");
	}
	
	{
		System.out.println("non-static block 1");
	}
	int a=demo();//non-static initializer
	public static void main(String[] args) {
		
		new Prog1();
		new Prog1(10);
		
	}
	
	{
		System.out.println("non-static block 2");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	Prog1(){
		System.out.println("Program1()");
	}
	
	Prog1(int a){
		System.out.println("Program1(int a)");
	}
	
	public int demo() {
		System.out.println("demo()");
		return 10;
	}
}