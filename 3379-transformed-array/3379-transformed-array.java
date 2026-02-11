class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        for(int i=0; i < n; i++){
            int num = nums[i];
            int target_index;

            if(num > 0){
                target_index = (i + num) % n;
                results[i] = nums[target_index];;
            }
            else if(num < 0){
                target_index = (i + num) % n;
                if(target_index < 0){
                    target_index += n;
                }
                results[i] = nums[target_index];
            }
            else {
                results[i] = 0;
            }
        }
        return results;
    }
}