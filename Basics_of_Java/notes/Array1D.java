package notes;

public class Array1D {
	public static void main(String[] args) {
	int [] arr = new int[] {10,30,8,6,7,2};
	for(int x =0; x<arr.length;x++) {
		if(arr[x]== 30) {
			arr[x]=40;
		}
		System.out.println(arr[x]);
		
	}
	
	}
}
