package string;

public class Program5 {

	public static void main(String[] args) {
		System.out.println("d".matches("[abc]"));
		System.out.println("d".matches("[^abc]"));
		System.out.println("m".matches("[a-z]"));
		System.out.println("M".matches("[a-z]"));
		System.out.println("M".matches("[A-Z]"));
		
		System.out.println("abc".matches("[a-z]+"));
		System.out.println("ABCabc".matches("[a-zA-Z]+"));
		System.out.println("abc123ABC".matches("[a-zA-Z0-9]+"));
		System.out.println("2".matches("[6-9]"));
		System.out.println("813492675".matches("[6-9][0-9]+"));
	}

}
