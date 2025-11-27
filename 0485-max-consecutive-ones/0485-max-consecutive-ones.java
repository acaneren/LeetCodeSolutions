class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max_consecutive = 0;
        
        for (int num : nums) {
            if (num == 1) {
                counter++;
                max_consecutive = Math.max(max_consecutive, counter);
            } 
            else {
                counter = 0;
            }
        }
        return max_consecutive;
    }
}