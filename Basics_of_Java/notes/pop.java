package notes;

import java.util.Stack;

public class pop {

	public static void main(String[] args) {
		Stack<Integer> s= new Stack();
		s.push(1);
		s.push(86);
		s.push(907);
		System.out.println(s);
		while(s.isEmpty()==false) {
			s.pop();
		}
		System.out.println(s);

	}

}
