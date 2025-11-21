class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int p1 = 0;
        int p2 = n;
        
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[p1];
            arr[2 * i + 1] = nums[p2];
            p1++;
            p2++;
        }
        return arr;
    }
}