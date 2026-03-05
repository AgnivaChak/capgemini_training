package object_demo;

public class Dummy {
	public int hashCode() {
		return 100;
	}
	public static void main(String[] args) {
		Dummy d= new Dummy();
		System.out.println(d.hashCode());
	}

}
