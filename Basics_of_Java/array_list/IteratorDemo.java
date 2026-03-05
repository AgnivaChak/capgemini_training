package array_list;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> countries=new ArrayList<String>();
		
		countries.add("india");
		countries.add("China");
		countries.add("USA");
		countries.add("Brazil");
		
		for(String s: countries) {
			System.out.println(s);
		}
		System.out.println("===============");
		Iterator<String> itr = countries.iterator();
		
		while(itr.hasNext()) {
			String coun = itr.next();
			
			System.out.println(coun);
		}
		

	}

}