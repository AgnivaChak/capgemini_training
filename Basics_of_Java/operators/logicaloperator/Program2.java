package operators.logicaloperator;

public class Program2 {
	public static void main(String[] args) {
		
		System.out.println(false || true || false);
		
		int a=6;
		System.out.println(a<10 || ++a>10); // as a<10 is true , so the remaining conditions will not execute -
		                                    //- therefore ++a>10 will not happen. value of 'a' remains same 
		System.out.println(a);
	}

}
