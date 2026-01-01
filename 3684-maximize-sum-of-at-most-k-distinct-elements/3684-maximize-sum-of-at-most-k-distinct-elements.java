class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int i = nums.length - 1;
        while (set.size() < k && i >= 0) {
            if (set.add(nums[i])) {
                list.add(nums[i]);
            }
            i--;
        }

        int[] ans = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            ans[j] = list.get(j);
        }
        return ans;
    }
}