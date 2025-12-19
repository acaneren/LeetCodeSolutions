class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = nums[0];
        right[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i];
        }

        int even_difference_count = 0;

        for (int i = 0; i < n - 1; i++) {
            if ((left[i] - right[i + 1]) % 2 == 0) {
                even_difference_count++;
            }
        }
        return even_difference_count;
    }
}