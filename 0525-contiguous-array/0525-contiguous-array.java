class Solution {
    public int findMaxLength(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        prefix[0] = 0;

        for (int i = 1; i <= nums.length; i++) {
            int add = -1;
            if (nums[i - 1] == 1) add = 1;
            prefix[i] = prefix[i - 1] + add;
        }

        int idx = 0;
        int max_len = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < prefix.length; i++) {
            if (!map.containsKey(prefix[i])) {
                map.put(prefix[i], i);
            } 
            else {
                int len = i - map.get(prefix[i]);
                if (len > max_len) {
                    max_len = len;
                }
            }
        }
        return max_len;
    }
}