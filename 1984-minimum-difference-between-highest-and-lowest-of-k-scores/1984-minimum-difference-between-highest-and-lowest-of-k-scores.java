class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = k - 1;
        int min_diff = Integer.MAX_VALUE;

        while (right < nums.length) {
            int diff = nums[right] - nums[left];
            if (diff < min_diff) {
                min_diff = diff;
            }
            left++;
            right++;
        }
        return min_diff;
    }
}