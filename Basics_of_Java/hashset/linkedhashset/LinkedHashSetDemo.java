package hashset.linkedhashset;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(10);
		lhs.add(50);
		lhs.add(70);
		
		System.out.println(lhs);
		
		//iterate here using foreach , iterator , ListIterator
		
		ArrayList<Integer> al = new ArrayList<Integer>(lhs);
		ListIterator<Integer> itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
