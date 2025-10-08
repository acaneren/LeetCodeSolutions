class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 0) {
                continue;
            }
            nums[left] = nums[i];
            left++;
        }

        while(left < nums.length){
            nums[left] = 0;
            left++;
        }
    }
}