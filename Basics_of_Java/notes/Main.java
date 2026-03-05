package notes;

class Test {
    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        int prev1 = 0, prev2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp;
        }

        System.out.println(prev1);
    }
}