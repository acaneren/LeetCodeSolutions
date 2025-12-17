class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff = 0;
        
        for(int i=0; i < k; i++){
            diff -= nums[i];
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            diff += nums[i];
        }
        return diff;
    }
}