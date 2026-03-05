package encapsulation;
import encapsulation.Demo;

public class Test3 {
	public static void main(String[] args) {

		Demo obj=Demo.createObject();
		
		//obj.a=30;
		obj.setValueA(100);
		
		System.out.println(obj.getValueA());
	}
}