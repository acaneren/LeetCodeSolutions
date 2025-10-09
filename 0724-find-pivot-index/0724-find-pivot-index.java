class Solution {
    public int pivotIndex(int[] nums) {
        int[] sum_left = new int[nums.length];
        int[] sum_right = new int[nums.length];

        sum_left[0] = 0;
        sum_right[nums.length-1] = 0;

        for(int i=1 ; i < nums.length; i++){
            sum_left[i] = sum_left[i-1] + nums[i-1];
        }
        for(int i = nums.length-2; i >= 0; i--){
            sum_right[i] = sum_right[i+1] + nums[i+1];
        }

        for(int i = 0; i < nums.length; i++){
            if(sum_left[i] == sum_right[i]){
                return i;
            }
        }
        return -1;
    }
}