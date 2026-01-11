class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }
            map.get(num).add(i);
        }

        for (List<Integer> list : map.values()) {
            for (int i = 1; i < list.size(); i++) {
                if (Math.abs(list.get(i - 1) - list.get(i)) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}