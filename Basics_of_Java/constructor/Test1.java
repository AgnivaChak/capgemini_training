package constructor;

public class Test1 {
	static int count=0;
	
	{
		count++;
	}
	//factory method means it should create an object.
	//this is called method chaining. 
	//in method chaining it does not mean that we need to create new object everytime
	//we just need the reference of the previous object
	public static Test1 m1() {
		System.out.println("m1()");
		return new Test1();
		
	}

	public static void main(String[] args) {
		//Test1 obj1=new Test1();
		//obj1.m1();
		//obj1.m2();
		//obj1.m3();
		
		Test1 obj=m1();
		obj.m1().m2().m3().m3().m2().m1();
		System.out.println(count);
		
		
		String s="hello";
		System.out.println((s.toUpperCase().substring(2,5).replaceAll("[A-Z]+","1")));
		System.out.println(s.substring(3).toUpperCase().charAt(0));
		
		
		
		
		
		
		

	}
	
	public Test1 m2() {
		System.out.println("m2()");
		return new Test1(); // new object will be created
		
	}
	
	public Test1 m3() {
		System.out.println("m3()");
		return new Test1();
		
	}

}