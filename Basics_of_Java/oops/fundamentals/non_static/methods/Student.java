package oops.fundamentals.non_static.methods;

public class Student {
	
	String name;
	int id;
	double per;
	
	Student(){
		
	}
	
	Student(String name, double per) {
		this.name=name;
		this.per=per;
		

}
	Student(int id, String name , double per) {
		this.name=name;
		this.id=id;
		this.per=per;
		

}
	Student(String name , int id, double per) {
		this.name=name;
		this.id=id;
		this.per=per;
		

}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("id : "+id);
		System.out.println("percentage: "+per);
}
}