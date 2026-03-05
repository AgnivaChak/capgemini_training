package searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,24,25,57,565,36,87,22};
		int value  = 24;
		boolean f = false;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i]== value) {
				System.out.println("found at position: "+ i );
				f  = true ;	
				break;
			}
		}
		if(!f) {
			System.out.println("not found"); 
		}
	}
}
