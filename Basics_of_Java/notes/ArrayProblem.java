package notes;

public class ArrayProblem {
	public static void main(String[] args) {
		int a = 0;
		int[] arr = new int[] {10,30,2,5,7,1};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>a){
				a = arr[i];
			}
		}System.out.println(a);
		
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<a){
				a = arr[i];
			}
		}System.out.println(a);
	}

}
