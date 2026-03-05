package string;

public class Program11 {

	public static void main(String[] args) {
		String d="helloABWx";
		System.out.println(d.matches("\\w+")); // this is to check if all the members are words or not
		String d1=" ";
		System.out.println(d1.matches("\\s+"));
	}

}
