package object_demo;

public class Emp {
	
	int id;
	String name;
	double salary;

	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name= name;
		this.salary =salary;

	}
	public String toString() {
		return "id: "+ id +", name: "+name+", salary: "+salary;
	}
	public static void main(String[] args) {
		Emp emp = new Emp(101, "Rohan", 50000);
		System.out.println(emp);
	}

}
