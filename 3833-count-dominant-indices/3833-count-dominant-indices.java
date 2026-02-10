class Solution {
    public int dominantIndices(int[] nums) {
        int count = 0;
        long suffix_sum = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            suffix_sum += nums[i + 1];
            double avg = (double) suffix_sum / (nums.length - 1 - i);
            if (nums[i] > avg) {
                count++;
            }
        }
        return count;
    }
}