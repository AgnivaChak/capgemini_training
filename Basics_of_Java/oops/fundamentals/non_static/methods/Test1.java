package oops.fundamentals.non_static.methods;

public class Test1 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=1;
		s1.name="Allen";
		s1.per=90.3;
		
		Student s2=new Student(2,"Miller",80.5);
		s2.display();
		s1.display();

	}

}

