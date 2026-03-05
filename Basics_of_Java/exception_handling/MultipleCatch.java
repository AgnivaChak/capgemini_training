package exception_handling;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Program has started");
		//Calling through multiple different TRYs
		/*
		try {
		    System.out.println(100 / 0);
		} catch (ArithmeticException e) {
		    System.out.println(e.getMessage());
		}

		try {
		    String s = null;
		    System.out.println(s.length());
		} catch (NullPointerException e) {
		    System.out.println(e.getMessage());
		}

		try {
		    int[] arr = new int[2];
		    System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println(e.getMessage());
		}*/
		
		//Calling through one single TRY
		//Program stops at the correct exception for the first exception
		try {
		    System.out.println(100 / 0);//only works for this. If there was no exception would move to the next one.

		    String s = null;
		    System.out.println(s.length());

		    int[] arr = new int[2];
		    System.out.println(arr[5]);

		} catch (NullPointerException e) {//ignores this
		    System.out.println(e.getMessage());
		} catch (ArithmeticException e) {//prints this 
		    System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println(e.getMessage());
		} catch (Throwable e) {//only last one can call Throwable or Exception class cuz 
								//if the earlier ones do it the code wouldn't go any further
		    System.out.println(e.getMessage());
		}

		System.out.println("Program ended");
	}

}