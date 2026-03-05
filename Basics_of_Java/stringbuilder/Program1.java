package stringbuilder;

public class Program1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();  //can only be created  by constructor
		System.out.println(sb.length());
		sb.append("12345678912345678");
		System.out.println(sb.capacity());

	}

}