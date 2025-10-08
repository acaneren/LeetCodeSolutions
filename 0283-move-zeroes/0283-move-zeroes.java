class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int counter = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 0) {
                counter++;
                continue;
            }
            nums[left] = nums[i];
            left++;
        }
        
        int right = nums.length-1;
        while(counter != 0){
            nums[right] = 0;
            right--;
            counter--;
        }
    }
}