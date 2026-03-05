package string;

public class Program10 {

	public static void main(String[] args) {
			System.out.println("83456".matches("[6-9]\\d+")); // this is to check if all the members are digit or not
			System.out.println("9876543210".matches("[6-9]\\d{9}"));
			System.out.println("9876543210".matches("[6-9]\\d{9,}"));
			System.out.println("9876543210235".matches("[6-9]\\d{9,12}"));

	}

}
