package looping_Statement.whileloop;

public class Spynumber {

	public static void main(String[] args) {
		//spy number
		int num=123;
		int sum=0;
		int product = 1;
		while(num!=0) {   // 123!=0
		sum = sum+num%10; // 0+3 -->3
		product = product*num%10;
		num=num/10;       // 123/10 -->12
		
		}
		System.out.println(sum);
		System.out.println(product);
	}

}
