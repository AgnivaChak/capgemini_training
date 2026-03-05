package program_variables;

public class Program9 {
	public static void main(String[] args) {
		short s=65; //2 byte
		char c=65;//2 byte
		//char c=s -- error despite both having same byte size
		System.out.println(c);
	}

}
