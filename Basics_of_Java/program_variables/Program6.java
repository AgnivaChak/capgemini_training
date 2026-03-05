package program_variables;

public class Program6 {
	public static void main(String[] args) {
		byte b = 20; // 1 byte
		int b1 = b; // 4 byte
		System.out.println(b1);
		// no issue   -- implicit typecasting 
		
		
		int i1 =30; //4 byte
		byte i2 = i1; //1 byte
		System.out.println(i2);
		// error - type mismatch - cannot convert from int to byte -- explicit typecasting
		
		
		
		
	}

}
