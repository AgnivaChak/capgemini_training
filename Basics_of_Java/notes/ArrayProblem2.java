package notes;

public class ArrayProblem2 {

	public static void main(String[] args) {
		int maxi = Integer.MIN_VALUE;
		int secondMaxi = Integer.MIN_VALUE;
		int[] arr = {10,30,2,5,7,20,1};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>maxi){
				secondMaxi = maxi;
				maxi = arr[i];
			}
			else if (arr[i] > secondMaxi && maxi != arr[i]) {
				secondMaxi = arr[i];
			}
		}
		System.out.println(secondMaxi);
		
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<min){
				secondMin = min;
				min = arr[i];
			}
			else if(arr[i]< secondMin && min != arr[i]) {
				secondMin = arr[i];
			}
		}System.out.println(secondMin);
	}

}
