package notes;
import java.util.*;

public class Array {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int n = nums.length;
		int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            res[i] = prod;
        }

        System.out.println(Arrays.toString(res));
    }
}