package looping_Statement.whileloop;

public class AutomorphicNumber {

	public static void main(String[] args) {
		int num=25;
		int bin=num;
		int count=0;
		int square = num*num;
		
		while(bin!=0) {
			bin= bin/10;
			count+=1;
		}
		
		int div = 1;
		while(count>0) {
			div = div * 10;
			count--;
		}
		int last = square%div;
		if (last==num)
			System.out.println("is AM");
		else
			System.out.println("not AM");
		
	}

}
