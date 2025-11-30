class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();
        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            if(nums[idx] > 0) {
                nums[idx] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                disappeared.add(i + 1);
            }
        }
        return disappeared;
    }
}