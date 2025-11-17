class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] == 1 && i + 1 < nums.length) {
                j = i + 1;
                while (j < nums.length && nums[j] != 1) {
                    j++;
                }
                if (j < nums.length) {
                    if (j - i - 1 < k) {
                        return false;
                    } 
                    else {
                        i = j - 1;
                    }
                }
            }
            i++;
        }
        return true;
    }
}