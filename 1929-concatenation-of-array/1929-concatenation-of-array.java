class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int q = 0;
        int p = nums.length;

        while (p < ans.length) {
            ans[q] = ans[p] = nums[q];
            p++;
            q++;
        }
        return ans;
    }
}