package abstraction;

public class B extends A{
	public void test() {
		System.out.println("B implementation");
	}
	public void testB() {
		System.out.println("test B method");
	}
	
	public static void main(String[] args) {
		
		A a = new B(); //upcast
		a.test();
		a.testA();
		
		B b = (B) a; //downcast
		b.testA();
		b.test();
		b.testB();
	}

}
