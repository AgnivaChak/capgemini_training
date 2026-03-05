package notes;
import java.util.*;

class Array_2 {
	public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;
        
        k = k % n;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}

