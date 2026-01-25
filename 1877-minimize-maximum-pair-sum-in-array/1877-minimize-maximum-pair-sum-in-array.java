class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        int max_sum = 0;
        while (i < j) {
            max_sum = Math.max(nums[i] + nums[j], max_sum);
            i++;
            j--;
        }
        return max_sum;
    }
}