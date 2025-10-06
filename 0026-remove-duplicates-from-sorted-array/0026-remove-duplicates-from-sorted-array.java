class Solution {
    public int removeDuplicates(int[] nums) {
        int current_num = nums[0];
        int left = 1;
        
        for(int i=1; i < nums.length; i++){
            if(nums[i] != current_num){
                current_num = nums[i];
                
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }
}