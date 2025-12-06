class Solution {
    public int smallestAbsent(int[] nums) {
        int candidate = (Arrays.stream(nums).sum() / nums.length) + 1;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while (true) {
            if (!set.contains(candidate) && candidate > 0) {
                return candidate;

            }
            candidate++;
        }
    }
}