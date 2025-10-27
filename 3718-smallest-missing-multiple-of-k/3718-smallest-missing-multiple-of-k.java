class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n = k;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > n) {
                return n;
            } else if (nums[i]  == n) {
                n += k;
            }
        }
        return n;
    }
}