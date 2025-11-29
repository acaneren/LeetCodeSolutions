class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i < nums.length; i++){
            nums[i] = nums[i] % k;
            sum += nums[i];
        }
        return sum % k;
    }
}