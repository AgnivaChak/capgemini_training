package operators.logicaloperator;

public class Program1 {

	public static void main(String[] args) {
		System.out.println(true && false && true);
		
		int a = 5;
		System.out.println(a>10 && ++a>a);  
		/*
		as a>10 is false , so the conditions after it wont execute - ++a>a is not executed
		*/
		System.out.println(a);

	}

}
